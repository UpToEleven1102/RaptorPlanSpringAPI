package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.TemplateEntityToTemplateResponse;
import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.data.entity.TemplateEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.CourseRepository;
import com.raptorplan.raptorplan.data.repository.TemplateRepository;
import com.raptorplan.raptorplan.model.request.TemplateRequest;
import com.raptorplan.raptorplan.model.response.TemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {
    private ConversionService conversionService;
    private TemplateRepository repoTemplate;
    private AttributeRepository repoAttribute;
    private CourseRepository repoCourse;

    @Autowired
    public TemplateService(TemplateRepository repoTemplate, ConversionService conversionService,
                           AttributeRepository repoAttribute, CourseRepository repoCourse) {
        this.repoTemplate = repoTemplate;
        this.conversionService = conversionService;
        this.repoAttribute = repoAttribute;
        this.repoCourse = repoCourse;
    }

    public TemplateResponse create(TemplateRequest source) {
        TemplateEntity entity = conversionService.convert(source, TemplateEntity.class);

        source.getInstAttributes().forEach(e -> {
            AttributeEntity attribute = repoAttribute.findOne(e);
            entity.addAttribute(attribute);
//            attribute.setTemplate(entity);
        });
        source.getRequiredCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e);
            entity.addCourses(course);
//            course.setTemplate(entity);
        });
        repoTemplate.save(entity);
        return conversionService.convert(entity, TemplateResponse.class);
    }

    public List<TemplateResponse> getAll() {
        Page<TemplateResponse> templates = new PageImpl<TemplateEntity>(Lists.newArrayList(repoTemplate.findAll()))
                .map(new TemplateEntityToTemplateResponse());

        return Lists.newArrayList(templates);
    }

    public TemplateResponse getByMajor(String major) {
        TemplateEntity entity = repoTemplate.findByMajor(major);
        return conversionService.convert(entity,TemplateResponse.class);
    }
}

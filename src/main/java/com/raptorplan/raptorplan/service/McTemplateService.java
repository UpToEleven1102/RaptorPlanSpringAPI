package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.TemplateEntityToTemplateResponse;
import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.data.entity.McTemplateEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.PageableCourseRepository;
import com.raptorplan.raptorplan.data.repository.McTemplateRepository;
import com.raptorplan.raptorplan.model.request.McTemplateRequest;
import com.raptorplan.raptorplan.model.response.McTemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class McTemplateService {
    private ConversionService conversionService;
    private McTemplateRepository repoTemplate;
    private AttributeRepository repoAttribute;
    private PageableCourseRepository repoCourse;

    @Autowired
    public McTemplateService(McTemplateRepository repoTemplate, ConversionService conversionService,
                             AttributeRepository repoAttribute, PageableCourseRepository repoCourse) {
        this.repoTemplate = repoTemplate;
        this.conversionService = conversionService;
        this.repoAttribute = repoAttribute;
        this.repoCourse = repoCourse;
    }

    public McTemplateResponse create(McTemplateRequest source) {
        McTemplateEntity entity = conversionService.convert(source, McTemplateEntity.class);

        source.getInstitutionalAttributes().forEach(e -> {
            AttributeEntity attribute = repoAttribute.findOne(e.getId());
//            entity.addAttribute(attribute);
        });
        source.getArtCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addArt(course);
        });
        source.getBehavioralCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addBehave(course);
        });
        source.getEnglCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addArt(course);
        });
        source.getElectiveCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addElectives(course);
        });

        source.getHumanCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addHumanities(course);
        });


        source.getProgramCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addMajor(course);
        });

        source.getMathCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addMath(course);
        });

        source.getScienceCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addScience(course);
        });

        source.getScienceLabCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addLabScience(course);
        });

        source.getSpeechCourses().forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
//            entity.addSpeech(course);
        });
        repoTemplate.save(entity);
        return conversionService.convert(entity, McTemplateResponse.class);
    }

    public List<McTemplateResponse> getAll() {
        Page<McTemplateResponse> templates = new PageImpl<McTemplateEntity>(Lists.newArrayList(repoTemplate.findAll()))
                .map(new TemplateEntityToTemplateResponse());

        return Lists.newArrayList(templates);
    }

    public McTemplateResponse getByMajor(String major) {
        McTemplateEntity entity = repoTemplate.findByMajorCode(major);
        return conversionService.convert(entity,McTemplateResponse.class);
    }
}

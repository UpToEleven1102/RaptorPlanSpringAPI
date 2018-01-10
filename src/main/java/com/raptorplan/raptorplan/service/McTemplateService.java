package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.McTemplateEntityToMcTemplateResponse;
import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.data.entity.McSemesterTemplate;
import com.raptorplan.raptorplan.data.entity.McTemplateEntity;
import com.raptorplan.raptorplan.data.repository.*;
import com.raptorplan.raptorplan.model.request.McTemplateRequest;
import com.raptorplan.raptorplan.model.response.McTemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class McTemplateService {
    private McTemplateRepository repoTransferTemplate;
    private AttributeRepository repoAttribute;
    private PageableCourseRepository repoCourse;
    private MajorRepository repoMajor;
    private UniversityRepository repoUniversity;
    private ConversionService conversionService;
    private SemesterTemplateRepository repoSemester;

    @Autowired
    public McTemplateService(McTemplateRepository repoTransferTemplate, ConversionService conversionService,
                             AttributeRepository repoAttribute, PageableCourseRepository repoCourse,
                             MajorRepository repoMajor, UniversityRepository repoUniversity, SemesterTemplateRepository repoSemester){
        this.repoTransferTemplate = repoTransferTemplate;
        this.repoAttribute = repoAttribute;
        this.repoCourse = repoCourse;
        this.repoMajor = repoMajor;
        this.repoUniversity = repoUniversity;
        this.conversionService = conversionService;
        this.repoSemester = repoSemester;
    }

    public McTemplateResponse create(McTemplateRequest requestBody){
        McTemplateEntity entity = new McTemplateEntity();
        entity.setMajor(repoMajor.findByCode(requestBody.getMajor()));
        entity.setUniversity(repoUniversity.findByCode(requestBody.getUniversity()));

        List<McSemesterTemplate> semesters = new ArrayList<>();

        requestBody.getSemesters().forEach(e -> {
            McSemesterTemplate mcSemesterTemplate = new McSemesterTemplate();
            List<AttributeEntity> attributeEntities = new ArrayList<AttributeEntity>();
            e.getAttributes().forEach(attribute -> {
                attributeEntities.add(repoAttribute.findOne(attribute.getId()));
            });

            List<CourseEntity> courseEntities = new ArrayList<CourseEntity>();
            e.getCourses().forEach(course -> {
                courseEntities.add(repoCourse.findOne(course.getId()));
            });

            mcSemesterTemplate.setCourses(courseEntities);
            mcSemesterTemplate.setAttributes(attributeEntities);
            repoSemester.save(mcSemesterTemplate);
            semesters.add(mcSemesterTemplate);
        });

        entity.setSemesters(semesters);

        repoTransferTemplate.save(entity);
        return conversionService.convert(entity,McTemplateResponse.class);
    }

    public McTemplateResponse get(Long id){
        McTemplateEntity entity = this.repoTransferTemplate.findOne(id);
        return this.conversionService.convert(entity,McTemplateResponse.class);
    }

    public McTemplateResponse getBySchoolAndMajor(String schoolCode, String majorCode) {
        McTemplateEntity entity = this.repoTransferTemplate.findByUniversityCodeAndMajorCode(schoolCode,majorCode);
        return conversionService.convert(entity,McTemplateResponse.class);
    }

    public List<McTemplateResponse> getAll(){
        return Lists.newArrayList(new PageImpl<McTemplateEntity>(Lists.newArrayList(repoTransferTemplate.findAll())).map(new McTemplateEntityToMcTemplateResponse()));
    }
}

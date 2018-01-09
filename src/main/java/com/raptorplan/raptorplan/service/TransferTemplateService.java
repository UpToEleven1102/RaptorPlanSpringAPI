package com.raptorplan.raptorplan.service;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.data.entity.SemesterTemplate;
import com.raptorplan.raptorplan.data.entity.TransferTemplateEntity;
import com.raptorplan.raptorplan.data.repository.*;
import com.raptorplan.raptorplan.model.IdHolder;
import com.raptorplan.raptorplan.model.request.TransferTemplateRequest;
import com.raptorplan.raptorplan.model.response.TransferTemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransferTemplateService {
    private TransferTemplateRepository repoTransferTemplate;
    private AttributeRepository repoAttribute;
    private PageableCourseRepository repoCourse;
    private MajorRepository repoMajor;
    private UniversityRepository repoUniversity;
    private ConversionService conversionService;
    private SemesterTemplateRepository repoSemester;

    @Autowired
    public TransferTemplateService(TransferTemplateRepository repoTransferTemplate, ConversionService conversionService,
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

    public TransferTemplateResponse create(TransferTemplateRequest requestBody){
        TransferTemplateEntity entity = new TransferTemplateEntity();
        entity.setMajor(repoMajor.findByCode(requestBody.getMajor()));
        entity.setUniversity(repoUniversity.findByCode(requestBody.getUniversity()));

        List<SemesterTemplate> semesters = new ArrayList<>();

        requestBody.getSemesters().forEach(e -> {
            SemesterTemplate semesterTemplate = new SemesterTemplate();
            List<AttributeEntity> attributeEntities = new ArrayList<AttributeEntity>();
            e.getAttributes().forEach(attribute -> {
                attributeEntities.add(repoAttribute.findOne(attribute.getId()));
            });

            List<CourseEntity> courseEntities = new ArrayList<CourseEntity>();
            e.getCourses().forEach(course -> {
                courseEntities.add(repoCourse.findOne(course.getId()));
            });

            semesterTemplate.setCourses(courseEntities);
            semesterTemplate.setAttributes(attributeEntities);
            repoSemester.save(semesterTemplate);
            semesters.add(semesterTemplate);
        });

        entity.setSemesters(semesters);

        repoTransferTemplate.save(entity);
        return conversionService.convert(entity,TransferTemplateResponse.class);
    }

    public TransferTemplateResponse get(Long id){
        TransferTemplateEntity entity = this.repoTransferTemplate.findOne(id);

        return this.conversionService.convert(entity,TransferTemplateResponse.class);
    }
}

package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.McTemplateEntityToMcTemplateResponse;
import com.raptorplan.raptorplan.data.entity.*;
import com.raptorplan.raptorplan.data.repository.*;
import com.raptorplan.raptorplan.model.CourseAttribute;
import com.raptorplan.raptorplan.model.customObject.AttributeCustom;
import com.raptorplan.raptorplan.model.request.McTemplateRequest;
import com.raptorplan.raptorplan.model.response.CourseInfoMcTemplateResponse;
import com.raptorplan.raptorplan.model.response.McTemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class McTemplateService {
    private ConversionService conversionService;
    private McTemplateRepository repoTemplate;
    private AttributeRepository repoAttribute;
    private PageableCourseRepository repoCourse;
    private CourseInfoRepository repoCourseInfo;
    private MajorRepository repoMajor;

    @Autowired
    public McTemplateService(McTemplateRepository repoTemplate, ConversionService conversionService,
                             AttributeRepository repoAttribute, PageableCourseRepository repoCourse,
                             CourseInfoRepository repoCourseInfo, MajorRepository repoMajor) {
        this.repoTemplate = repoTemplate;
        this.conversionService = conversionService;
        this.repoAttribute = repoAttribute;
        this.repoCourse = repoCourse;
        this.repoCourseInfo = repoCourseInfo;
        this.repoMajor = repoMajor;
    }

    public CourseInfoMcTemplate convertCourseInfo(String name, String attributeCode, Integer credit, List<CourseAttribute> courses){
        CourseInfoMcTemplate courseInfo = new CourseInfoMcTemplate();
        courseInfo.setCredit(credit);
        courseInfo.setName(name);

        courseInfo.setAttribute(repoAttribute.findByCode(attributeCode));

        courses.forEach(e -> {
            CourseEntity course = repoCourse.findOne(e.getId());
            courseInfo.addCourse(course);
        });
        repoCourseInfo.save(courseInfo);
        return courseInfo;
    }

    public McTemplateResponse create(McTemplateRequest source) {
        McTemplateEntity entity = new McTemplateEntity();

        entity.setInstCredit(source.getInstitutionalCredit());

        source.getInstitutionalAttributes().forEach(e -> {
            AttributeEntity attribute = repoAttribute.findOne(e.getId());
            entity.addAttribute(attribute);
        });

        entity.setMajor(repoMajor.findByCode(source.getMajor()));

        entity.addCourseInfo(convertCourseInfo("Art Distribution","art_distribution", source.getArtDistributionCredit(), source.getArtCourses()));

        entity.addCourseInfo(convertCourseInfo("Behavioral Distribution", "behavioral_distribution", source.getBehavioralDistributionCredit(), source.getBehavioralCourses()));

        entity.addCourseInfo(convertCourseInfo("English Foundation" , "english_foundation", source.getEnFoundationCredit(), source.getEnglCourses()));

        entity.addCourseInfo(convertCourseInfo("Electives" , "electives", source.getElectivesCredit(), source.getElectiveCourses()));

        entity.addCourseInfo(convertCourseInfo("Humanities Distribution" , "humanities_distribution", source.getHumanDistributionCredit(), source.getHumanCourses()));

        entity.addCourseInfo(convertCourseInfo("Major Requirement" , "major", source.getProgramCredit(), source.getProgramCourses()));

        entity.addCourseInfo(convertCourseInfo("Math Foundation" , "math_foundation", source.getMathFoundationCredit(), source.getMathCourses()));

        entity.addCourseInfo(convertCourseInfo("Science Distribution" , "natural_science_distribution", source.getScienceDistributionCredit(), source.getScienceCourses()));

        entity.addCourseInfo(convertCourseInfo("Science Distribution with Lab" , "natural_science_lab_distribution", source.getScienceLabDistributionCredit(), source.getScienceLabCourses()));

        entity.addCourseInfo(convertCourseInfo("Speech Foundation" , "speech_foundation", source.getSpeechFoundationCredit(), source.getSpeechCourses()));

        repoTemplate.save(entity);
        return conversionService.convert(entity, McTemplateResponse.class);
    }

    public List<McTemplateResponse> getAll() {
        Page<McTemplateResponse> templates = new PageImpl<McTemplateEntity>(Lists.newArrayList(repoTemplate.findAll()))
                .map(new McTemplateEntityToMcTemplateResponse());
        return Lists.newArrayList(templates);
    }

    public McTemplateResponse getByMajor(String major) {
        McTemplateEntity entity = repoTemplate.findByMajorCode(major);
        McTemplateResponse response = conversionService.convert(entity,McTemplateResponse.class);
        return response;
    }
}

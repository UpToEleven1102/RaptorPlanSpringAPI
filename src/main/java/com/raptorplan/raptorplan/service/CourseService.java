package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.CourseEntityToCourseResponse;
import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.data.entity.DisciplineEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.CourseRepository;
import com.raptorplan.raptorplan.data.repository.DisciplineRepository;
import com.raptorplan.raptorplan.model.CourseAttribute;
import com.raptorplan.raptorplan.model.request.CourseRequest;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository repoCourse;
    private DisciplineRepository repoDiscipline;
    private AttributeRepository repoAttribute;
    private ConversionService conversionService;

    @Autowired
    public CourseService(CourseRepository repoCourse, ConversionService conversionService,
                         DisciplineRepository repoDiscipline, AttributeRepository repoAttribute){
        this.repoCourse = repoCourse;
        this.conversionService = conversionService;
        this.repoDiscipline = repoDiscipline;
        this.repoAttribute = repoAttribute;
    }

    public CourseResponse createCourse(CourseRequest requestObj){
        CourseEntity entity = conversionService.convert(requestObj,CourseEntity.class);
        DisciplineEntity discipline = repoDiscipline.findByCode(requestObj.getSubject());
        entity.setDiscipline(discipline);
        discipline.addCourse(entity);

        for (CourseAttribute attribute :
                requestObj.getAttributes()) {
            AttributeEntity attributeEntity = repoAttribute.findById(attribute.getId());
            entity.addAttribute(attributeEntity);
            attributeEntity.addCourse(entity);
        }
        repoCourse.save(entity);
        return conversionService.convert(entity, CourseResponse.class);
    }

    public List<CourseResponse> getCoursesByDisciplineCode(String code){
        return null;
    }

    public List<CourseResponse> getCourses(){
        List<CourseResponse> response = Lists.newArrayList(new PageImpl(Lists.newArrayList(repoCourse.findAll())).map(new CourseEntityToCourseResponse()));
        return response;
    }

    public CourseResponse getCourseByCode(String code){
        return this.conversionService.convert(this.repoCourse.findByCode(code),CourseResponse.class);
    }
}

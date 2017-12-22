package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.model.request.CourseRequest;
import org.springframework.core.convert.converter.Converter;

public class CourseRequestToCourseEntity implements Converter<CourseRequest,CourseEntity> {
    @Override
    public CourseEntity convert(CourseRequest source) {
        CourseEntity entity = new  CourseEntity();
        entity.setCode(source.getCode());
        entity.setCredit(source.getCredit());
        entity.setTitle(source.getName());
        return entity;
    }
}

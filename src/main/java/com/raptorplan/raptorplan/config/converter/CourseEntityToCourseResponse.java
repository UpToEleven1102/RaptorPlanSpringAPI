package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class CourseEntityToCourseResponse implements Converter<CourseEntity,CourseResponse> {
    @Override
    public CourseResponse convert(CourseEntity source) {
        CourseResponse response = new CourseResponse();
        response.setCode(source.getCode());
        if(null != source.getAttributes())
            response.setAttribute(convertAttributeEntities(source.getAttributes()));
        response.setCredit(source.getCredit());
        response.setId(source.getId());
        response.setSubject(source.getSubject());
        response.setTitle(source.getTitle());

        return response;
    }

    public List<AttributeResponse> convertAttributeEntities(List<AttributeEntity> source){
        AttributeEntityToAttributeResponse converter = new AttributeEntityToAttributeResponse();
        List<AttributeResponse> response = new ArrayList<>();
        for (AttributeEntity entity:
             source){
            response.add(converter.convert(entity));
        }
        return response;
    }
}

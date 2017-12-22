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
        response.setTitle(source.getTitle());
        response.setId(source.getId());
        response.setCredit(source.getCredit());
        response.setCode(source.getCode());
        response.setSubject(source.getDiscipline().getCode());
        List<String> attributes = new ArrayList<>();
        for (AttributeEntity attribute :
                source.getAttributes()) {
            attributes.add(attribute.getName());
        }
        response.setAttribute(attributes);

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

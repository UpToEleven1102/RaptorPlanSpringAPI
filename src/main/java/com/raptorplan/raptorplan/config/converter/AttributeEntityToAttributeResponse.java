package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;
import java.util.ArrayList;
import java.util.List;

public class AttributeEntityToAttributeResponse implements Converter<AttributeEntity,AttributeResponse> {
    @Override
    public AttributeResponse convert(AttributeEntity source) {
        AttributeResponse response = new AttributeResponse();
        response.setName(source.getName());
        response.setId(source.getId());
        response.setCode(source.getCode());

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.ATTRIBUTE_PATH + "/" + response.getId());
        links.setSelf(self);
        response.setLinks(links);
        if(null!=source.getCourses())
            response.setCourses(convertCourseEntity(source.getCourses()));

        return response;
    }

    public List<CourseResponse> convertCourseEntity(List<CourseEntity> sourceList){
        CourseEntityToCourseResponse converter = new CourseEntityToCourseResponse();
        List<CourseResponse> response = new ArrayList<>();

        for (CourseEntity entity :
                sourceList) {
            response.add(converter.convert(entity));
        }
        return response;
    }
}

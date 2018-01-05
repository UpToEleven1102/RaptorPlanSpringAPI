package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.CourseInfoMcTemplate;
import com.raptorplan.raptorplan.model.response.CourseInfoMcTemplateResponse;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class CourseInfoTemplateToCourseInfoTemplateResponse implements Converter<CourseInfoMcTemplate, CourseInfoMcTemplateResponse>{
    CourseEntityToCourseResponse converterCourse = new CourseEntityToCourseResponse();
    AttributeEntityToAttributeCustom converterAttribute = new AttributeEntityToAttributeCustom();

    @Override
    public CourseInfoMcTemplateResponse convert(CourseInfoMcTemplate source) {
        CourseInfoMcTemplateResponse response = new CourseInfoMcTemplateResponse();
        response.setId(source.getId());
        response.setCredit(source.getCredit());
        response.setName(source.getName());
        response.setAttribute(converterAttribute.convert(source.getAttribute()));

        List<CourseResponse> courseResponse = new ArrayList<>();

        source.getCourses().forEach(e->{
            courseResponse.add(converterCourse.convert(e));
        });
        response.setCourses(courseResponse);
        return response;
    }
}

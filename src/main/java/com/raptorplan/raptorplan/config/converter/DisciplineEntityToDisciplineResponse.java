package com.raptorplan.raptorplan.config.converter;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.data.entity.CourseEntity;
import com.raptorplan.raptorplan.data.entity.DisciplineEntity;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import com.raptorplan.raptorplan.model.response.DisciplineResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.PageImpl;

public class DisciplineEntityToDisciplineResponse implements Converter<DisciplineEntity,DisciplineResponse>{
    @Override
    public DisciplineResponse convert(DisciplineEntity source) {
        DisciplineResponse response = new DisciplineResponse();
        response.setCode(source.getCode());
        response.setId(source.getId());
        response.setName(source.getName());

        if(null!= source.getCourses()){
            Iterable<CourseResponse> pageResponse = new PageImpl<CourseEntity>(source.getCourses()).map(new CourseEntityToCourseResponse());
            response.setCourses(Lists.newArrayList(pageResponse));
        }

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.DISCIPLINE_PATH+"/"+source.getCode());
        links.setSelf(self);

        response.setLinks(links);
        return response;
    }
}

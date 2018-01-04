package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.UniversityEntity;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.response.UniversityResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;

public class UniversityEntityToUniversityResponse implements Converter<UniversityEntity, UniversityResponse> {
    @Override
    public UniversityResponse convert(UniversityEntity source) {
        UniversityResponse response = new UniversityResponse();
        response.setId(source.getId());
        response.setCode(source.getCode());
        response.setName(source.getName());

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.UNIVERSITY_PATH + "/" + source.getId());
        links.setSelf(self);
        response.setLinks(links);
        return response;
    }
}

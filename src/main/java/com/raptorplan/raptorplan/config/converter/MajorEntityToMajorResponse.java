package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.MajorEntity;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.response.MajorResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;

public class MajorEntityToMajorResponse implements Converter<MajorEntity,MajorResponse> {

    @Override
    public MajorResponse convert(MajorEntity source) {
        MajorResponse response = new MajorResponse();
        response.setId(source.getId());
        response.setCode(source.getCode());
        response.setName(source.getName());

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.MAJOR_PATH + "/"+source.getCode());
        links.setSelf(self);
        response.setLinks(links);

        return response;
    }


}

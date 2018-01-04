package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.MajorEntity;
import com.raptorplan.raptorplan.model.request.MajorRequest;
import org.springframework.core.convert.converter.Converter;

public class MajorRequestToMajorEntity implements Converter<MajorRequest, MajorEntity> {

    @Override
    public MajorEntity convert(MajorRequest source) {
        MajorEntity entity = new MajorEntity();
        entity.setCode(source.getCode());
        entity.setName(source.getName());
        return entity;
    }
}

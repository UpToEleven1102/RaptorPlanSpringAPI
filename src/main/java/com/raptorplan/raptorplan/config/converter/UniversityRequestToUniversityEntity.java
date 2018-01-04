package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.UniversityEntity;
import com.raptorplan.raptorplan.model.request.UniversityRequest;
import org.springframework.core.convert.converter.Converter;

public class UniversityRequestToUniversityEntity implements Converter<UniversityRequest,UniversityEntity> {

    @Override
    public UniversityEntity convert(UniversityRequest source) {
        UniversityEntity entity = new UniversityEntity();
        entity.setCode(source.getCode());
        entity.setName(source.getName());
        return entity;
    }
}

package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.DisciplineEntity;
import com.raptorplan.raptorplan.model.request.DisciplineRequest;
import org.springframework.core.convert.converter.Converter;

public class DisciplineRequestToDisciplineEntity implements Converter<DisciplineRequest,DisciplineEntity> {

    @Override
    public DisciplineEntity convert(DisciplineRequest source) {
        DisciplineEntity entity = new DisciplineEntity();
        entity.setCode(source.getCode());
        entity.setName(source.getName());
        return entity;
    }
}

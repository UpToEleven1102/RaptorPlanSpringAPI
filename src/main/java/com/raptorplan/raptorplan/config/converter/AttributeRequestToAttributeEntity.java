package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.model.request.AttributeRequest;
import org.springframework.core.convert.converter.Converter;

public class AttributeRequestToAttributeEntity implements Converter<AttributeRequest,AttributeEntity>{

    public AttributeEntity convert(AttributeRequest source) {
        AttributeEntity entity = new AttributeEntity();
        entity.setName(source.getName());
        return entity;
    }
}

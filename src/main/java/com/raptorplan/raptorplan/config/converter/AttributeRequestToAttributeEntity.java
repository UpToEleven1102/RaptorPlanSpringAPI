package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.data.repository.CategoryRepository;
import com.raptorplan.raptorplan.model.request.AttributeRequest;
import com.raptorplan.raptorplan.model.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class AttributeRequestToAttributeEntity implements Converter<AttributeRequest,AttributeEntity>{

    public AttributeEntity convert(AttributeRequest source) {
        AttributeEntity entity = new AttributeEntity();
        entity.setName(source.getName());
        return entity;
    }
}

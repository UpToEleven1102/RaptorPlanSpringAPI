package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.customObject.AttributeCustom;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;

public class AttributeEntityToAttributeCustom implements Converter<AttributeEntity,AttributeCustom> {
    @Override
    public AttributeCustom convert(AttributeEntity source) {
        AttributeCustom response = new AttributeCustom(source.getId(),source.getCode(),source.getName());
        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.ATTRIBUTE_PATH + "/" + source.getId());
        links.setSelf(self);
        response.setLinks(links);
        return response;
    }
}

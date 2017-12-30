package com.raptorplan.raptorplan.service;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.customObject.AttributeCustom;
import com.raptorplan.raptorplan.model.request.AttributeRequest;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AttributeService {
    public AttributeRepository repoAttribute;
    public ConversionService conversionService;

    @Autowired
    public AttributeService(AttributeRepository attributeRepository, ConversionService conversionService){
        this.repoAttribute = attributeRepository;
        this.conversionService = conversionService;
    }

    public AttributeResponse create(AttributeRequest requestObj){
        AttributeEntity attribute = conversionService.convert(requestObj, AttributeEntity.class);
        AttributeResponse response = conversionService.convert(repoAttribute.save(attribute),AttributeResponse.class);
        return response;
    }

    public List<AttributeCustom> getAll(){
        List<AttributeCustom> response =  repoAttribute.getAttributeList();
        response.forEach( e ->{
            Links links = new Links();
            Self self = new Self();
            self.setRef(ResourceConstant.ATTRIBUTE_PATH+"/"+e.getId());
            links.setSelf(self);
            e.setLinks(links);
        });
        return response;
    }

    public AttributeResponse get(Long id){
        AttributeEntity entity = repoAttribute.findById(id);
        AttributeResponse response = entity == null? null : conversionService.convert(entity , AttributeResponse.class);
        return response;
    }

    public void delete(Long id){
        repoAttribute.delete(id);
    }
}

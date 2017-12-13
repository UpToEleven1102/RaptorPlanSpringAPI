package com.raptorplan.raptorplan.service;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.model.request.AttributeRequest;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AttributeService {
    public AttributeRepository repo;
    public ConversionService conversionService;

    @Autowired
    public AttributeService(AttributeRepository attributeRepository, ConversionService conversionService){
        this.repo = attributeRepository;
        this.conversionService = conversionService;
    }

    public AttributeResponse create(AttributeRequest requestObj){
        AttributeEntity attribute = conversionService.convert(requestObj, AttributeEntity.class);
        AttributeResponse response = conversionService.convert(repo.save(attribute),AttributeResponse.class);
        return response;
    }

    public List<AttributeResponse> getAll(){
        //TODO: fetch data from database
        return new ArrayList<AttributeResponse>();
    }

    public AttributeResponse get(Long id){
        AttributeEntity entity = repo.findById(id);

        AttributeResponse response = entity == null? null : conversionService.convert(entity , AttributeResponse.class);
        return response;
    }
}

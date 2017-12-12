package com.raptorplan.raptorplan.service;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AttributeService {
    public AttributeRepository attributeRepository;

    public AttributeService(AttributeRepository attributeRepository){
        this.attributeRepository = attributeRepository;
    }

    public AttributeEntity create(String name){
        //TODO: save to database
        AttributeEntity attribute = new AttributeEntity(name);
        return attribute;
    }

    public List<AttributeEntity> getAll(){
        //TODO: fetch data from database
        return new ArrayList<AttributeEntity>();
    }

    public AttributeEntity get(Long id){
        return new AttributeEntity();
    }

}

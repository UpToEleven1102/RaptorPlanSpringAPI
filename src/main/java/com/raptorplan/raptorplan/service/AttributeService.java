package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.AttributeEntityToAttributeResponse;
import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.CategoryRepository;
import com.raptorplan.raptorplan.model.request.AttributeRequest;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AttributeService {
    public AttributeRepository repoAttribute;
    public ConversionService conversionService;
    public CategoryRepository repoCategory;

    @Autowired
    public AttributeService(AttributeRepository attributeRepository, ConversionService conversionService, CategoryRepository categoryRepository){
        this.repoAttribute = attributeRepository;
        this.conversionService = conversionService;
        this.repoCategory = categoryRepository;
    }

    public AttributeResponse create(AttributeRequest requestObj){
        AttributeEntity attribute = conversionService.convert(requestObj, AttributeEntity.class);
        CategoryEntity category = repoCategory.findById(requestObj.getCategoryId());

        category.addAttribute(attribute);
        repoCategory.save(category);

        attribute.setCategory(category);
        AttributeResponse response = conversionService.convert(repoAttribute.save(attribute),AttributeResponse.class);
        return response;
    }

    public List<AttributeResponse> getAll(){
        ArrayList<AttributeEntity> query =  Lists.newArrayList(repoAttribute.findAll());
        List<AttributeResponse> response = null;
        if(query.size()!=0&&query!=null){
            response = Lists.newArrayList((new PageImpl<AttributeEntity>(query)).map(new AttributeEntityToAttributeResponse()));
        }
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

package com.raptorplan.raptorplan.config.converter;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import com.raptorplan.raptorplan.model.response.CategoryResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

public class CategoryEntityToCategoryResponse implements Converter<CategoryEntity,CategoryResponse> {
    @Override
    public CategoryResponse convert(CategoryEntity source) {
        CategoryResponse response = new CategoryResponse();
        response.setId(source.getId());
        response.setName(source.getName());
        if(null!=source.getAttributes()){
            Iterable<AttributeResponse> pageAttribute = (new PageImpl(source.getAttributes())).map(new AttributeEntityToAttributeResponse());
            response.setAttributes(Lists.newArrayList(pageAttribute));
        }
        return response;
    }
}

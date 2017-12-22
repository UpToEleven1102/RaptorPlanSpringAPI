package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.CategoryEntityToCategoryResponse;
import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.data.repository.CategoryRepository;
import com.raptorplan.raptorplan.model.customObject.CategoryCustom;
import com.raptorplan.raptorplan.model.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository repo;
    private ConversionService conversionService;

    @Autowired
    public CategoryService(CategoryRepository repo, ConversionService conversionService){
        this.repo = repo;
        this.conversionService = conversionService;
    }

    public List<CategoryCustom> getCategoryList(){
        List<CategoryCustom> categories = repo.getCategoryList();
        return categories;
    }

    public List<CategoryResponse> getCategories(){
        List<CategoryResponse> response = new ArrayList<>();
        Page<CategoryResponse> page = new PageImpl<CategoryEntity>(Lists.newArrayList(repo.findAll())).map(new CategoryEntityToCategoryResponse());
        page.forEach(category ->{
            response.add(category);
        });
        return response;
    }

    public CategoryResponse getCategoryById(Long id){
        CategoryResponse response = conversionService.convert(repo.findById(id),CategoryResponse.class);
        return response;
    }

    public CategoryResponse getCategoryByName(String category){
        return conversionService.convert(repo.findByName(category),CategoryResponse.class);
    }
}

package com.raptorplan.raptorplan.rest;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.CategoryEntityToCategoryResponse;
import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.CategoryRepository;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import com.raptorplan.raptorplan.model.response.CategoryResponse;
import com.raptorplan.raptorplan.service.AttributeService;
import com.raptorplan.raptorplan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.CATEGORY_PATH)
public class CategoryResource {
    private CategoryRepository categoryRepo;

    private AttributeRepository attributeRepo;

    private CategoryService service;

    @Autowired
    public CategoryResource(CategoryRepository categoryRepo, AttributeRepository attributeRepo, CategoryService service) {
        this.categoryRepo = categoryRepo;
        this.attributeRepo = attributeRepo;
        this.service = service;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<List<CategoryResponse>> getCategories(){
        List<CategoryResponse> response = service.getCategoryList();
//        CategoryEntityToCategoryResponse converter = new CategoryEntityToCategoryResponse();
//        Iterable<CategoryEntity> entities = repo.findAll();
//        for (CategoryEntity entity :
//                entities) {
//            response.add(converter.convert(entity));
//        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

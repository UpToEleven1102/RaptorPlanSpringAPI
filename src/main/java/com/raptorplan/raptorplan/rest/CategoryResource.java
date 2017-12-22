package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.CategoryRepository;
import com.raptorplan.raptorplan.model.customObject.CategoryCustom;
import com.raptorplan.raptorplan.model.response.CategoryResponse;
import com.raptorplan.raptorplan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<CategoryCustom>> getCategories(){
        List<CategoryCustom> response = service.getCategoryList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "{categoryId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CategoryResponse> getById(@PathVariable Long categoryId){
        return new ResponseEntity(service.getCategoryById(categoryId), HttpStatus.OK);
    }


}

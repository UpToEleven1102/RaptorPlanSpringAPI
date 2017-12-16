package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.model.response.CategoryResponse;

public class AttributeRequest {
    public String name;
    public Long category;
    public AttributeRequest(){}

    public AttributeRequest(String name, Long category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Long getCategoryId() {
        return category;
    }

    public void setCategoryId(Long categoryId) {
        this.category = categoryId;
    }
}

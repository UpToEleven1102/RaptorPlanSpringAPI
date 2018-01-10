package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.model.response.CategoryResponse;

public class AttributeRequest {
    public String name;
    public String code;

    public AttributeRequest(){}

    public AttributeRequest(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

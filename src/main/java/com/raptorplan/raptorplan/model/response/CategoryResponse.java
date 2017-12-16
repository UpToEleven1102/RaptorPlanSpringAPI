package com.raptorplan.raptorplan.model.response;

import java.util.List;

public class CategoryResponse {
    private Long id;
    private String name;
    private List<AttributeResponse> attributes;

    public CategoryResponse() {}

    public CategoryResponse(Long id, String name, List<AttributeResponse> attributes) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AttributeResponse> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeResponse> attributes) {
        this.attributes = attributes;
    }
}

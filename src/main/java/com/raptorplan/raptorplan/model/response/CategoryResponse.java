package com.raptorplan.raptorplan.model.response;

import com.raptorplan.raptorplan.model.Links;

import java.util.List;

public class CategoryResponse {
    private Long id;
    private String name;
    private List<AttributeResponse> attributes;
    private Links links;

    public CategoryResponse() {}

    public CategoryResponse(Long id, String name, List<AttributeResponse> attributes, Links links) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
        this.links = links;
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

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}

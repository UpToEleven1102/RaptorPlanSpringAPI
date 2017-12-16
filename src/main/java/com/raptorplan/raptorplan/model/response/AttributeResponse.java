package com.raptorplan.raptorplan.model.response;

import com.raptorplan.raptorplan.model.Links;

import java.util.List;

public class AttributeResponse {
    private Long id;
    private String name;
    private List<CourseResponse> courses;
    private String category;
    private Links links;

    public AttributeResponse() {
    }

    public AttributeResponse(Long id, String name, List<CourseResponse> courses, String category, Links links) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.category = category;
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

    public List<CourseResponse> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseResponse> courses) {
        this.courses = courses;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

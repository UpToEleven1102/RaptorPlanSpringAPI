package com.raptorplan.raptorplan.model.response;

import com.raptorplan.raptorplan.model.Links;

import java.util.List;

public class DisciplineResponse {
    private Long id;
    private String name;
    private String code;
    private List<CourseResponse> courses;
    private Links links;

    public DisciplineResponse(){}

    public DisciplineResponse(Long id, String name, String code, List<CourseResponse> courses) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.courses = courses;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<CourseResponse> getCourses() {
        return courses;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public void setCourses(List<CourseResponse> courses) {
        this.courses = courses;
    }
}

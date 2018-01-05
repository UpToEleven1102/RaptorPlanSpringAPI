package com.raptorplan.raptorplan.model.response;

import com.raptorplan.raptorplan.model.customObject.AttributeCustom;

import java.util.List;

public class CourseInfoMcTemplateResponse {
    private Long id;
    private String name;
    private Integer credit;
    private AttributeCustom attribute;
    private List<CourseResponse> courses;

    public CourseInfoMcTemplateResponse() {
    }

    public CourseInfoMcTemplateResponse(Long id, String name, Integer credit, AttributeCustom attribute, List<CourseResponse> courses) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.attribute = attribute;
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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public AttributeCustom getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeCustom attribute) {
        this.attribute = attribute;
    }

    public List<CourseResponse> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseResponse> courses) {
        this.courses = courses;
    }
}

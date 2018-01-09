package com.raptorplan.raptorplan.model.response;

import com.raptorplan.raptorplan.model.customObject.AttributeCustom;

import java.util.List;

public class SemesterTemplateResponse {
    List<AttributeCustom> attributes;
    List<CourseResponse> courses;

    public SemesterTemplateResponse() {
    }

    public SemesterTemplateResponse(List<AttributeCustom> attributes, List<CourseResponse> courses) {
        this.attributes = attributes;
        this.courses = courses;
    }

    public List<AttributeCustom> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeCustom> attributes) {
        this.attributes = attributes;
    }

    public List<CourseResponse> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseResponse> courses) {
        this.courses = courses;
    }
}

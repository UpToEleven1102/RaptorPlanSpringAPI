package com.raptorplan.raptorplan.model.customObject;

import com.raptorplan.raptorplan.model.IdHolder;

import java.util.List;

public class SemesterCustom{
    private List<IdHolder> attributes;
    private List<IdHolder> courses;

    public SemesterCustom() {
    }

    public List<IdHolder> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<IdHolder> attributes) {
        this.attributes = attributes;
    }

    public List<IdHolder> getCourses() {
        return courses;
    }

    public void setCourses(List<IdHolder> courses) {
        this.courses = courses;
    }
}
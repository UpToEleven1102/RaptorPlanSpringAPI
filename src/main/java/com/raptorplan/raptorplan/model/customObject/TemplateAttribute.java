package com.raptorplan.raptorplan.model.customObject;


import com.raptorplan.raptorplan.model.response.CourseResponse;

import java.util.ArrayList;
import java.util.List;

public class TemplateAttribute {
    private Integer credit;
    private List<CourseResponse> courses;



    public TemplateAttribute(){}

    public TemplateAttribute(Integer credit, List<CourseResponse> courses) {
        this.credit = credit;
        this.courses = courses;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public List<CourseResponse> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseResponse> courses) {
        this.courses = courses;
    }

    public void addCourse(CourseResponse course){
        if(this.courses==null){
            this.courses = new ArrayList<>();
        }
        this.courses.add(course);
    }
}

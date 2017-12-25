package com.raptorplan.raptorplan.model;

public class CourseAttribute {
    private Long id;

    public CourseAttribute(){}

    public CourseAttribute(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}

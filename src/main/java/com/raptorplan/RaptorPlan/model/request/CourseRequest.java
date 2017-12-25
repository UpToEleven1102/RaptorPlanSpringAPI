package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.model.CourseAttribute;

import java.util.List;

public class CourseRequest {
    private String subject;
    private String code;
    private Integer credit;
    private String name;
    private List<CourseAttribute> attributes;

    public CourseRequest(){}

    public CourseRequest(String subject, String code, Integer credit, String name, List<CourseAttribute> attributes) {
        this.subject = subject;
        this.code = code;
        this.credit = credit;
        this.name = name;
        this.attributes = attributes;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<CourseAttribute> attributes) {
        this.attributes = attributes;
    }

}


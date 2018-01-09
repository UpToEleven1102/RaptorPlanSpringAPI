package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.model.IdHolder;

import java.util.List;

public class CourseRequest {
    private String subject;
    private String code;
    private Integer credit;
    private String name;
    private List<IdHolder> attributes;

    public CourseRequest(){}

    public CourseRequest(String subject, String code, Integer credit, String name, List<IdHolder> attributes) {
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

    public List<IdHolder> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<IdHolder> attributes) {
        this.attributes = attributes;
    }

}


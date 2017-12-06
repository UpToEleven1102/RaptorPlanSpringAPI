package com.raptorplan.RaptorPlan.model.response;

import com.raptorplan.RaptorPlan.model.Attribute;
import com.raptorplan.RaptorPlan.model.Links;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CourseResponse {
    private Integer id;
    private String subject;
    private String code;
    private Integer credit;
    private String title;
    private Attribute[] attribute;
    private Links links;

    public CourseResponse() {
        super();
    }

    public CourseResponse(Integer id, String subject, String code, Integer credit, String title, Attribute[] attribute, Links links) {
        this.id = id;
        this.subject = subject;
        this.code = code;
        this.credit = credit;
        this.title = title;
        this.attribute = attribute;
        this.links = links;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Attribute[] getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute[] attribute) {
        this.attribute = attribute;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}

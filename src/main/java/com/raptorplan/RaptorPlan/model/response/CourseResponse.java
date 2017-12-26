package com.raptorplan.raptorplan.model.response;


import com.raptorplan.raptorplan.model.Links;

import java.util.List;

public class CourseResponse {
    private Long id;
    private String subject;
    private String code;
    private Integer credit;
    private String title;
    private List<String> attribute;
    private Links links;

    public CourseResponse() {
        super();
    }

    public CourseResponse(Long id, String subject, String code, Integer credit, String title, List<String> attribute, Links links) {
        this.id = id;
        this.subject = subject;
        this.code = code;
        this.credit = credit;
        this.title = title;
        this.attribute = attribute;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<String> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<String> attribute) {
        this.attribute = attribute;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}

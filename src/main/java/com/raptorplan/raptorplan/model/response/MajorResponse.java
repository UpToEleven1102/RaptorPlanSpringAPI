package com.raptorplan.raptorplan.model.response;

import com.raptorplan.raptorplan.model.Links;

public class MajorResponse {
    private Long id;
    private String code;
    private String name;
    private Links links;

    public MajorResponse() {
    }

    public MajorResponse(Long id, String code, String name, Links links) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}

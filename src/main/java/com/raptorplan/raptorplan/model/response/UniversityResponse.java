package com.raptorplan.raptorplan.model.response;

import com.raptorplan.raptorplan.model.Links;

public class UniversityResponse {
    private Long id;

    public String code;

    public String name;

    public Links links;

    public UniversityResponse(Long id, String code, String name, Links links) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.links = links;
    }

    public UniversityResponse() {
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


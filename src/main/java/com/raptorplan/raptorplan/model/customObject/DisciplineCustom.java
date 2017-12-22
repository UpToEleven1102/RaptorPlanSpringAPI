package com.raptorplan.raptorplan.model.customObject;

import com.raptorplan.raptorplan.model.Links;

public class DisciplineCustom {
    private Long id;
    private String code;
    private String name;
    private Links links;

    public DisciplineCustom() {}

    public DisciplineCustom(Long id, String name,String code) {
        this.id = id;
        this.code = code;
        this.name = name;
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

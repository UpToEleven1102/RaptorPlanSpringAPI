package com.raptorplan.raptorplan.auth.model.custom;

import com.raptorplan.raptorplan.model.Links;

public class RoleCustom {
    private Long id;
    private String name;
    private Links links;

    public RoleCustom() {
    }

    public RoleCustom(Long id, String name, Links links) {
        this.id = id;
        this.name = name;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

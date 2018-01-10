package com.raptorplan.raptorplan.auth.model.response;

import com.raptorplan.raptorplan.auth.model.custom.RoleCustom;
import com.raptorplan.raptorplan.model.Links;

import java.util.List;

public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String mNumber;
    private List<RoleCustom> roles;
    private Links links;

    public UserResponse() {
    }

    public UserResponse(Long id, String firstName, String lastName, String mNumber, List<RoleCustom> roles, Links links) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mNumber = mNumber;
        this.roles = roles;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public List<RoleCustom> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleCustom> roles) {
        this.roles = roles;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}

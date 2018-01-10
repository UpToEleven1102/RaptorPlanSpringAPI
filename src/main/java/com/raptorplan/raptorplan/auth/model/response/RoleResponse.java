package com.raptorplan.raptorplan.auth.model.response;

import java.util.List;

public class RoleResponse {
    private Long id;
    private String name;
    private List<UserResponse> users;

    public RoleResponse() {
    }

    public RoleResponse(Long id, String name, List<UserResponse> users) {
        this.id = id;
        this.name = name;
        this.users = users;
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

    public List<UserResponse> getUsers() {
        return users;
    }

    public void setUsers(List<UserResponse> users) {
        this.users = users;
    }
}

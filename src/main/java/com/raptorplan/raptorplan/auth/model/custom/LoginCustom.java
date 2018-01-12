package com.raptorplan.raptorplan.auth.model.custom;

public class LoginCustom {
    private String username;
    private String password;

    public LoginCustom(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginCustom() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

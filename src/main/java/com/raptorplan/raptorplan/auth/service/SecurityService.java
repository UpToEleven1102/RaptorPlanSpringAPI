package com.raptorplan.raptorplan.auth.service;

public interface SecurityService {
    public String findLoggedInUserName();
    public void autoLogin(String username, String password);
}

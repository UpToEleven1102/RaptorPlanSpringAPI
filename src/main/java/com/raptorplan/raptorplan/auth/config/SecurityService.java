package com.raptorplan.raptorplan.auth.config;

public interface SecurityService {
    public String findLoggedInUserName();
    public void autoLogin(String username, String password);
}

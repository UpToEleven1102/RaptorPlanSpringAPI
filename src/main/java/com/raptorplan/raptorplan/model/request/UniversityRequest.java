package com.raptorplan.raptorplan.model.request;

public class UniversityRequest {
    private String code;
    private String name;

    public UniversityRequest() {
    }

    public UniversityRequest(String code, String name) {
        this.code = code;
        this.name = name;
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
}

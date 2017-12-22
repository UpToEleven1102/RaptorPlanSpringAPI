package com.raptorplan.raptorplan.model.request;

public class DisciplineRequest {
    private String name;
    private String code;

    public DisciplineRequest(){}

    public DisciplineRequest(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

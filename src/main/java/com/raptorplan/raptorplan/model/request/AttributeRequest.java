package com.raptorplan.raptorplan.model.request;

public class AttributeRequest {
    public String name;

    public AttributeRequest(){}

    public AttributeRequest(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}

package com.raptorplan.raptorplan.model;

public class IdHolder {
    private Long id;

    public IdHolder(){}

    public IdHolder(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}

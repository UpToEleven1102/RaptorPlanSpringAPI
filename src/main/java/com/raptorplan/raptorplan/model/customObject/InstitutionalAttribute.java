package com.raptorplan.raptorplan.model.customObject;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.model.response.AttributeResponse;

import java.util.ArrayList;
import java.util.List;

public class InstitutionalAttribute {
    private Integer credit;
    private List<AttributeResponse> attributes;

    public InstitutionalAttribute(){}

    public InstitutionalAttribute(Integer credit, List<AttributeResponse> attributes) {
        this.credit = credit;
        this.attributes = attributes;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public List<AttributeResponse> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeResponse> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(AttributeResponse attribute){
        if(this.attributes == null){
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attribute);
    }
}

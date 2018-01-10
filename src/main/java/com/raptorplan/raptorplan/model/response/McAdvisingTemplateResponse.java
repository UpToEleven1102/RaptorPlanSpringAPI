package com.raptorplan.raptorplan.model.response;


import com.raptorplan.raptorplan.model.customObject.AttributeCustom;
import com.raptorplan.raptorplan.model.customObject.MajorCustom;

import java.util.List;

public class McAdvisingTemplateResponse {
    private Long id;

    private MajorCustom major;

    private Integer instCredit;

    private List<AttributeCustom> instAttributes;

    private List<CourseInfoMcTemplateResponse> courseInfo;

    public McAdvisingTemplateResponse(Long id, MajorCustom major, List<AttributeCustom> instAttributes, List<CourseInfoMcTemplateResponse> courseInfo) {
        this.id = id;
        this.major = major;
        this.instAttributes = instAttributes;
        this.courseInfo = courseInfo;
    }

    public McAdvisingTemplateResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInstCredit() {
        return instCredit;
    }

    public void setInstCredit(Integer instCredit) {
        this.instCredit = instCredit;
    }

    public MajorCustom getMajor() {
        return major;
    }

    public void setMajor(MajorCustom major) {
        this.major = major;
    }

    public List<AttributeCustom> getInstAttributes() {
        return instAttributes;
    }

    public void setInstAttributes(List<AttributeCustom> instAttributes) {
        this.instAttributes = instAttributes;
    }

    public List<CourseInfoMcTemplateResponse> getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(List<CourseInfoMcTemplateResponse> courseInfo) {
        this.courseInfo = courseInfo;
    }
}

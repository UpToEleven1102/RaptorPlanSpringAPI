package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.model.customObject.SemesterCustom;

import java.util.List;

public class McTemplateRequest {
    private String major;
    private String university;

    private List<SemesterCustom> semesters;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public List<SemesterCustom> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<SemesterCustom> semesters) {
        this.semesters = semesters;
    }

}



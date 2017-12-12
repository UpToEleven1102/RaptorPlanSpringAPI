package com.raptorplan.raptorplan.model.academic_template;


import com.raptorplan.raptorplan.model.Course;

import java.util.List;

public class SpeechFoundation {
    private Integer id;
    private Integer credit;
    private List<com.raptorplan.raptorplan.model.Course> Course;

    public SpeechFoundation() {
    }

    public SpeechFoundation(Integer id, Integer credit, List<Course> course) {
        this.id = id;
        this.credit = credit;
        Course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public List<Course> getCourse() {
        return Course;
    }

    public void setCourse(List<Course> course) {
        Course = course;
    }
}

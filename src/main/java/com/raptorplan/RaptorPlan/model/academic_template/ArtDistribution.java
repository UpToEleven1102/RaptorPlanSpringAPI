package com.raptorplan.RaptorPlan.model.academic_template;

import com.raptorplan.RaptorPlan.model.Course;

public class ArtDistribution {
    private Integer id;
    private Integer credit;
    private Course[] Course;

    public ArtDistribution() {
    }

    public ArtDistribution(Integer id, Integer credit, Course[] course) {
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

    public Course[] getCourse() {
        return Course;
    }

    public void setCourse(Course[] course) {
        Course = course;
    }
}

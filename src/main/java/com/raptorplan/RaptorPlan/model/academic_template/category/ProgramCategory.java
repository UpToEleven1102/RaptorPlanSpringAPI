package com.raptorplan.raptorplan.model.academic_template.category;

import com.raptorplan.raptorplan.model.academic_template.Electives;
import com.raptorplan.raptorplan.model.academic_template.MajorRequirement;

public class ProgramCategory {
    private Integer id;
    private MajorRequirement major;
    private Electives electives;

    public ProgramCategory() {
    }

    public ProgramCategory(Integer id, MajorRequirement major, Electives electives) {
        this.id = id;
        this.major = major;
        this.electives = electives;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MajorRequirement getMajor() {
        return major;
    }

    public void setMajor(MajorRequirement major) {
        this.major = major;
    }

    public Electives getElectives() {
        return electives;
    }

    public void setElectives(Electives electives) {
        this.electives = electives;
    }
}

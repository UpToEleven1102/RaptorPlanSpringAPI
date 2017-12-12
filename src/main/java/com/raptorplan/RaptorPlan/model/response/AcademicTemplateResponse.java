package com.raptorplan.raptorplan.model.response;


import com.raptorplan.raptorplan.model.academic_template.category.DistributionCategory;
import com.raptorplan.raptorplan.model.academic_template.category.FoundationCategory;
import com.raptorplan.raptorplan.model.academic_template.category.ProgramCategory;

public class AcademicTemplateResponse {
    private Integer id;
    private String majorCode;
    private FoundationCategory foundation;
    private DistributionCategory distribution;
    private ProgramCategory program;

    public AcademicTemplateResponse() {}

    public AcademicTemplateResponse(Integer id, String majorCode, FoundationCategory foundation, DistributionCategory distribution, ProgramCategory program) {
        this.id = id;
        this.majorCode = majorCode;
        this.foundation = foundation;
        this.distribution = distribution;
        this.program = program;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public FoundationCategory getFoundation() {
        return foundation;
    }

    public void setFoundation(FoundationCategory foundation) {
        this.foundation = foundation;
    }

    public DistributionCategory getDistribution() {
        return distribution;
    }

    public void setDistribution(DistributionCategory distribution) {
        this.distribution = distribution;
    }

    public ProgramCategory getProgram() {
        return program;
    }

    public void setProgram(ProgramCategory program) {
        this.program = program;
    }
}

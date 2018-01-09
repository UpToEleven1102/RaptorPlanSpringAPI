package com.raptorplan.raptorplan.model.response;


import java.util.List;

public class TransferTemplateResponse {
    private Long id;
    private MajorResponse major;
    private UniversityResponse university;

    private List<SemesterTemplateResponse> semesters;

    public TransferTemplateResponse() {
    }

    public TransferTemplateResponse(Long id, MajorResponse major, UniversityResponse university, List<SemesterTemplateResponse> semesters) {
        this.id = id;
        this.major = major;
        this.university = university;
        this.semesters = semesters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MajorResponse getMajor() {
        return major;
    }

    public void setMajor(MajorResponse major) {
        this.major = major;
    }

    public UniversityResponse getUniversity() {
        return university;
    }

    public void setUniversity(UniversityResponse university) {
        this.university = university;
    }

    public List<SemesterTemplateResponse> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<SemesterTemplateResponse> semesters) {
        this.semesters = semesters;
    }
}

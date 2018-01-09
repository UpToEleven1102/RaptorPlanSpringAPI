package com.raptorplan.raptorplan.data.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "H.tran_template")
public class TransferTemplateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<SemesterTemplate> semesters;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private UniversityEntity university;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private MajorEntity major;

    public TransferTemplateEntity() {
    }

    public TransferTemplateEntity(List<SemesterTemplate> semesters, UniversityEntity university, MajorEntity major) {
        this.semesters = semesters;
        this.university = university;
        this.major = major;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SemesterTemplate> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<SemesterTemplate> semesters) {
        this.semesters = semesters;
    }

    public UniversityEntity getUniversity() {
        return university;
    }

    public void setUniversity(UniversityEntity university) {
        this.university = university;
    }

    public MajorEntity getMajor() {
        return major;
    }

    public void setMajor(MajorEntity major) {
        this.major = major;
    }
}

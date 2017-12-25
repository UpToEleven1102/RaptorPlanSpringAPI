package com.raptorplan.raptorplan.data.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "H.templates")
public class TemplateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "major", unique = true)
    private String major;

    @Column(name = "englCredit")
    private Integer enFoundationCredit;

    @Column(name = "mathCredit")
    private Integer mathFoundationCredit;

    @Column(name = "speechCredit")
    private Integer speechFoundationCredit;

    @Column(name = "artCredit")
    private Integer artDistributionCredit;

    @Column(name = "behaveCredit")
    private Integer behavioralDistributionCredit;

    @Column(name = "humanCredit")
    private Integer humanDistributionCredit;

    @Column(name = "scienceCredit")
    private Integer scienceDistributionCredit;

    @Column(name = "scienceLabCredit")
    private Integer scienceLabDistributionCredit;

    @Column(name = "programCredit")
    private Integer programCredit;

    @Column(name = "electivesCredit")
    private Integer electivesCredit;

    @Column(name = "institutionalCredit")
    private Integer institutionalCredit;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<AttributeEntity> instAttributes;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> requiredCourses;

    public TemplateEntity() {
    }

    public TemplateEntity(String major, Integer enFoundationCredit, Integer mathFoundationCredit, Integer speechFoundationCredit, Integer artDistributionCredit, Integer behavioralDistributionCredit, Integer humanDistributionCredit, Integer scienceDistributionCredit, Integer scienceLabDistributionCredit, Integer programCredit, Integer electivesCredit, Integer institutionalCredit, List<AttributeEntity> institutionalAttributes, List<CourseEntity> requiredCourses) {
        this.major = major;
        this.enFoundationCredit = enFoundationCredit;
        this.mathFoundationCredit = mathFoundationCredit;
        this.speechFoundationCredit = speechFoundationCredit;
        this.artDistributionCredit = artDistributionCredit;
        this.behavioralDistributionCredit = behavioralDistributionCredit;
        this.humanDistributionCredit = humanDistributionCredit;
        this.scienceDistributionCredit = scienceDistributionCredit;
        this.scienceLabDistributionCredit = scienceLabDistributionCredit;
        this.programCredit = programCredit;
        this.electivesCredit = electivesCredit;
        this.institutionalCredit = institutionalCredit;
        this.instAttributes = institutionalAttributes;
        this.requiredCourses = requiredCourses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getEnFoundationCredit() {
        return enFoundationCredit;
    }

    public void setEnFoundationCredit(Integer enFoundationCredit) {
        this.enFoundationCredit = enFoundationCredit;
    }

    public Integer getMathFoundationCredit() {
        return mathFoundationCredit;
    }

    public void setMathFoundationCredit(Integer mathFoundationCredit) {
        this.mathFoundationCredit = mathFoundationCredit;
    }

    public Integer getSpeechFoundationCredit() {
        return speechFoundationCredit;
    }

    public void setSpeechFoundationCredit(Integer speechFoundationCredit) {
        this.speechFoundationCredit = speechFoundationCredit;
    }

    public Integer getArtDistributionCredit() {
        return artDistributionCredit;
    }

    public void setArtDistributionCredit(Integer artDistributionCredit) {
        this.artDistributionCredit = artDistributionCredit;
    }

    public Integer getBehavioralDistributionCredit() {
        return behavioralDistributionCredit;
    }

    public void setBehavioralDistributionCredit(Integer behavioralDistributionCredit) {
        this.behavioralDistributionCredit = behavioralDistributionCredit;
    }

    public Integer getHumanDistributionCredit() {
        return humanDistributionCredit;
    }

    public void setHumanDistributionCredit(Integer humanDistributionCredit) {
        this.humanDistributionCredit = humanDistributionCredit;
    }

    public Integer getScienceDistributionCredit() {
        return scienceDistributionCredit;
    }

    public void setScienceDistributionCredit(Integer scienceDistributionCredit) {
        this.scienceDistributionCredit = scienceDistributionCredit;
    }

    public Integer getScienceLabDistributionCredit() {
        return scienceLabDistributionCredit;
    }

    public void setScienceLabDistributionCredit(Integer scienceLabDistributionCredit) {
        this.scienceLabDistributionCredit = scienceLabDistributionCredit;
    }

    public Integer getProgramCredit() {
        return programCredit;
    }

    public void setProgramCredit(Integer programCredit) {
        this.programCredit = programCredit;
    }

    public Integer getElectivesCredit() {
        return electivesCredit;
    }

    public void setElectivesCredit(Integer electivesCredit) {
        this.electivesCredit = electivesCredit;
    }

    public Integer getInstitutionalCredit() {
        return institutionalCredit;
    }

    public void setInstitutionalCredit(Integer institutionalCredit) {
        this.institutionalCredit = institutionalCredit;
    }

    public List<AttributeEntity> getInstitutionalAttributes() {
        return this.instAttributes;
    }

    public void setInstitutionalAttributes(List<AttributeEntity> institutionalAttributes) {
        this.instAttributes = institutionalAttributes;
    }

    public List<CourseEntity> getRequiredCourses() {
        return requiredCourses;
    }

    public void setRequiredCourses(List<CourseEntity> requiredCourses) {
        this.requiredCourses = requiredCourses;
    }

    public void addCourses(CourseEntity course){
        if(this.requiredCourses==null){
            this.requiredCourses = new ArrayList<>();
            this.requiredCourses.add(course);
        } else if (!this.requiredCourses.contains(course)) {
            this.requiredCourses.add(course);
        }
    }

    public void addAttribute(AttributeEntity attribute){
        if(this.instAttributes==null){
            this.instAttributes = new ArrayList<>();
            this.instAttributes.add(attribute);
        } else if(!this.instAttributes.contains(attribute)){
            this.instAttributes.add(attribute);
        }
    }
}

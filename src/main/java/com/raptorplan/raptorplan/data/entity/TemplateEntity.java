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
    private List<CourseEntity> englCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> mathCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> speechCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> artCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> behaveCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> humanCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> scienceCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> labCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> majorCourses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<CourseEntity> electiveCourses;

    public TemplateEntity() {
    }

    public TemplateEntity(String major, Integer enFoundationCredit, Integer mathFoundationCredit, Integer speechFoundationCredit, Integer artDistributionCredit, Integer behavioralDistributionCredit, Integer humanDistributionCredit, Integer scienceDistributionCredit, Integer scienceLabDistributionCredit, Integer programCredit, Integer electivesCredit, Integer institutionalCredit, List<AttributeEntity> instAttributes, List<CourseEntity> englCourses, List<CourseEntity> mathCourses, List<CourseEntity> speechCourses, List<CourseEntity> artCourses, List<CourseEntity> behaveCourses, List<CourseEntity> humanCourses, List<CourseEntity> scienceCourses, List<CourseEntity> labCourses, List<CourseEntity> majorCourses, List<CourseEntity> electiveCourses) {
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
        this.instAttributes = instAttributes;
        this.englCourses = englCourses;
        this.mathCourses = mathCourses;
        this.speechCourses = speechCourses;
        this.artCourses = artCourses;
        this.behaveCourses = behaveCourses;
        this.humanCourses = humanCourses;
        this.scienceCourses = scienceCourses;
        this.labCourses = labCourses;
        this.majorCourses = majorCourses;
        this.electiveCourses = electiveCourses;
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

    public List<AttributeEntity> getInstAttributes() {
        return instAttributes;
    }

    public void setInstAttributes(List<AttributeEntity> instAttributes) {
        this.instAttributes = instAttributes;
    }

    public List<CourseEntity> getEnglCourses() {
        return englCourses;
    }

    public void setEnglCourses(List<CourseEntity> englCourses) {
        this.englCourses = englCourses;
    }

    public List<CourseEntity> getMathCourses() {
        return mathCourses;
    }

    public void setMathCourses(List<CourseEntity> mathCourses) {
        this.mathCourses = mathCourses;
    }

    public List<CourseEntity> getSpeechCourses() {
        return speechCourses;
    }

    public void setSpeechCourses(List<CourseEntity> speechCourses) {
        this.speechCourses = speechCourses;
    }

    public List<CourseEntity> getArtCourses() {
        return artCourses;
    }

    public void setArtCourses(List<CourseEntity> artCourses) {
        this.artCourses = artCourses;
    }

    public List<CourseEntity> getBehaveCourses() {
        return behaveCourses;
    }

    public void setBehaveCourses(List<CourseEntity> behaveCourses) {
        this.behaveCourses = behaveCourses;
    }

    public List<CourseEntity> getHumanCourses() {
        return humanCourses;
    }

    public void setHumanCourses(List<CourseEntity> humanCourses) {
        this.humanCourses = humanCourses;
    }

    public List<CourseEntity> getScienceCourses() {
        return scienceCourses;
    }

    public void setScienceCourses(List<CourseEntity> scienceCourses) {
        this.scienceCourses = scienceCourses;
    }

    public List<CourseEntity> getLabCourses() {
        return labCourses;
    }

    public void setLabCourses(List<CourseEntity> labCourses) {
        this.labCourses = labCourses;
    }

    public List<CourseEntity> getMajorCourses() {
        return majorCourses;
    }

    public void setMajorCourses(List<CourseEntity> majorCourses) {
        this.majorCourses = majorCourses;
    }

    public List<CourseEntity> getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(List<CourseEntity> electiveCourses) {
        this.electiveCourses = electiveCourses;
    }

    public void addEngl(CourseEntity course){
        if(this.englCourses==null) {
            this.englCourses = new ArrayList<>();
        }
        else if(!this.englCourses.contains(course)){
            this.englCourses.add(course);
        }
        
    }

    public void addSpeech(CourseEntity course){
        if(this.speechCourses==null){
            this.speechCourses = new ArrayList<>();
            this.speechCourses.add(course);
        } else if(!this.speechCourses.contains(course)){
            this.speechCourses.add(course);
        }
    }

    public void addMath(CourseEntity course){
        if(this.mathCourses==null){
            this.mathCourses = new ArrayList<>();
            this.mathCourses.add(course);
        } else if(!this.mathCourses.contains(course)){
            this.mathCourses.add(course);
        }
    }

    public void addArt(CourseEntity course){
        if(this.artCourses==null){
            this.artCourses = new ArrayList<>();
            this.artCourses.add(course);
        } else if(!this.artCourses.contains(course)){
            this.artCourses.add(course);
        }
    }

    public void addBehave(CourseEntity course){
        if(this.behaveCourses==null){
            this.behaveCourses = new ArrayList<>();
            this.behaveCourses.add(course);
        } else if(!this.behaveCourses.contains(course)){
            this.behaveCourses.add(course);
        }
    }

    public void addHumanities(CourseEntity course){
        if(this.humanCourses==null){
            this.humanCourses = new ArrayList<>();
            this.humanCourses.add(course);
        } else if(!this.humanCourses.contains(course)){
            this.humanCourses.add(course);
        }

    }

    public void addScience(CourseEntity course){
        if(this.scienceCourses==null){
            this.scienceCourses = new ArrayList<>();
            this.scienceCourses.add(course);
        } else if(!this.scienceCourses.contains(course)){
            this.scienceCourses.add(course);
        }
    }

    public void addLabScience(CourseEntity course){
        if(this.labCourses ==null){
            this.labCourses = new ArrayList<>();
            this.labCourses.add(course);
        } else if(!this.labCourses.contains(course)){
            this.labCourses.add(course);
        }
    }

    public void addMajor(CourseEntity course){
        if(this.majorCourses==null){
            this.majorCourses = new ArrayList<>();
            this.majorCourses.add(course);
        } else if(!this.majorCourses.contains(course)){
            this.majorCourses.add(course);
        }
    }

    public void addElectives(CourseEntity course){
        if(this.electiveCourses==null){
            this.electiveCourses = new ArrayList<>();
            this.electiveCourses.add(course);
        } else if(!this.electiveCourses.contains(course)){
            this.electiveCourses.add(course);
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

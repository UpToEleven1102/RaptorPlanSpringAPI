package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CourseEntity;

import java.util.List;

public class TemplateRequest {
    private String major;

    private Integer enFoundationCredit;

    private Integer mathFoundationCredit;

    private Integer speechFoundationCredit;

    private Integer artDistributionCredit;

    private Integer behavioralDistributionCredit;

    private Integer humanDistributionCredit;

    private Integer scienceDistributionCredit;

    private Integer scienceLabDistributionCredit;

    private Integer programCredit;

    private Integer electivesCredit;

    private Integer institutionalCredit;

    private List<Long> instAttributes;

    private List<Long> englCourses;

    private List<Long> mathCourses;

    private List<Long> speechCourses;

    private List<Long> artCourses;

    private List<Long> behaveCourses;

    private List<Long> humanCourses;

    private List<Long> scienceCourses;

    private List<Long> scienceLabCourses;

    private List<Long> majorCourses;

    private List<Long> electiveCourses;

    public TemplateRequest(){}

    public TemplateRequest(String major, Integer enFoundationCredit, Integer mathFoundationCredit, Integer speechFoundationCredit, Integer artDistributionCredit, Integer behavioralDistributionCredit, Integer humanDistributionCredit, Integer scienceDistributionCredit, Integer scienceLabDistributionCredit, Integer programCredit, Integer electivesCredit, Integer institutionalCredit, List<Long> instAttributes, List<Long> englCourses, List<Long> mathCourses, List<Long> speechCourses, List<Long> artCourses, List<Long> behaveCourses, List<Long> humanCourses, List<Long> scienceCourses, List<Long> scienceLabCourses, List<Long> majorCourses, List<Long> electiveCourses) {
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
        this.scienceLabCourses = scienceLabCourses;
        this.majorCourses = majorCourses;
        this.electiveCourses = electiveCourses;
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

    public List<Long> getInstAttributes() {
        return instAttributes;
    }

    public void setInstAttributes(List<Long> instAttributes) {
        this.instAttributes = instAttributes;
    }

    public List<Long> getEnglCourses() {
        return englCourses;
    }

    public void setEnglCourses(List<Long> englCourses) {
        this.englCourses = englCourses;
    }

    public List<Long> getMathCourses() {
        return mathCourses;
    }

    public void setMathCourses(List<Long> mathCourses) {
        this.mathCourses = mathCourses;
    }

    public List<Long> getSpeechCourses() {
        return speechCourses;
    }

    public void setSpeechCourses(List<Long> speechCourses) {
        this.speechCourses = speechCourses;
    }

    public List<Long> getArtCourses() {
        return artCourses;
    }

    public void setArtCourses(List<Long> artCourses) {
        this.artCourses = artCourses;
    }

    public List<Long> getBehaveCourses() {
        return behaveCourses;
    }

    public void setBehaveCourses(List<Long> behaveCourses) {
        this.behaveCourses = behaveCourses;
    }

    public List<Long> getHumanCourses() {
        return humanCourses;
    }

    public void setHumanCourses(List<Long> humanCourses) {
        this.humanCourses = humanCourses;
    }

    public List<Long> getScienceCourses() {
        return scienceCourses;
    }

    public void setScienceCourses(List<Long> scienceCourses) {
        this.scienceCourses = scienceCourses;
    }

    public List<Long> getScienceLabCourses() {
        return scienceLabCourses;
    }

    public void setScienceLabCourses(List<Long> scienceLabCourses) {
        this.scienceLabCourses = scienceLabCourses;
    }

    public List<Long> getMajorCourses() {
        return majorCourses;
    }

    public void setMajorCourses(List<Long> majorCourses) {
        this.majorCourses = majorCourses;
    }

    public List<Long> getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(List<Long> electiveCourses) {
        this.electiveCourses = electiveCourses;
    }
}

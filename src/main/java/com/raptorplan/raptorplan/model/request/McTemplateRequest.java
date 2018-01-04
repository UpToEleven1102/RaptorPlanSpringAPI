package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.model.CourseAttribute;

import java.util.List;

public class McTemplateRequest {
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

    private List<CourseAttribute> institutionalAttributes;

    private List<CourseAttribute> englCourses;

    private List<CourseAttribute> mathCourses;

    private List<CourseAttribute> speechCourses;

    private List<CourseAttribute> artCourses;

    private List<CourseAttribute> behavioralCourses;

    private List<CourseAttribute> humanCourses;

    private List<CourseAttribute> scienceCourses;

    private List<CourseAttribute> scienceLabCourses;

    private List<CourseAttribute> programCourses;

    private List<CourseAttribute> electiveCourses;

    public McTemplateRequest(){}

    public McTemplateRequest(String major, Integer enFoundationCredit, Integer mathFoundationCredit, Integer speechFoundationCredit, Integer artDistributionCredit, Integer behavioralDistributionCredit, Integer humanDistributionCredit, Integer scienceDistributionCredit, Integer scienceLabDistributionCredit, Integer programCredit, Integer electivesCredit, Integer institutionalCredit, List<CourseAttribute> institutionalAttributes, List<CourseAttribute> englCourses, List<CourseAttribute> mathCourses, List<CourseAttribute> speechCourses, List<CourseAttribute> artCourses, List<CourseAttribute> behavioralCourses, List<CourseAttribute> humanCourses, List<CourseAttribute> scienceCourses, List<CourseAttribute> scienceLabCourses, List<CourseAttribute> programCourses, List<CourseAttribute> electiveCourses) {
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
        this.institutionalAttributes = institutionalAttributes;
        this.englCourses = englCourses;
        this.mathCourses = mathCourses;
        this.speechCourses = speechCourses;
        this.artCourses = artCourses;
        this.behavioralCourses = behavioralCourses;
        this.humanCourses = humanCourses;
        this.scienceCourses = scienceCourses;
        this.scienceLabCourses = scienceLabCourses;
        this.programCourses = programCourses;
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

    public List<CourseAttribute> getInstitutionalAttributes() {
        return institutionalAttributes;
    }

    public void setInstitutionalAttributes(List<CourseAttribute> institutionalAttributes) {
        this.institutionalAttributes = institutionalAttributes;
    }

    public List<CourseAttribute> getEnglCourses() {
        return englCourses;
    }

    public void setEnglCourses(List<CourseAttribute> englCourses) {
        this.englCourses = englCourses;
    }

    public List<CourseAttribute> getMathCourses() {
        return mathCourses;
    }

    public void setMathCourses(List<CourseAttribute> mathCourses) {
        this.mathCourses = mathCourses;
    }

    public List<CourseAttribute> getSpeechCourses() {
        return speechCourses;
    }

    public void setSpeechCourses(List<CourseAttribute> speechCourses) {
        this.speechCourses = speechCourses;
    }

    public List<CourseAttribute> getArtCourses() {
        return artCourses;
    }

    public void setArtCourses(List<CourseAttribute> artCourses) {
        this.artCourses = artCourses;
    }

    public List<CourseAttribute> getBehavioralCourses() {
        return behavioralCourses;
    }

    public void setBehavioralCourses(List<CourseAttribute> behavioralCourses) {
        this.behavioralCourses = behavioralCourses;
    }

    public List<CourseAttribute> getHumanCourses() {
        return humanCourses;
    }

    public void setHumanCourses(List<CourseAttribute> humanCourses) {
        this.humanCourses = humanCourses;
    }

    public List<CourseAttribute> getScienceCourses() {
        return scienceCourses;
    }

    public void setScienceCourses(List<CourseAttribute> scienceCourses) {
        this.scienceCourses = scienceCourses;
    }

    public List<CourseAttribute> getScienceLabCourses() {
        return scienceLabCourses;
    }

    public void setScienceLabCourses(List<CourseAttribute> scienceLabCourses) {
        this.scienceLabCourses = scienceLabCourses;
    }

    public List<CourseAttribute> getProgramCourses() {
        return programCourses;
    }

    public void setProgramCourses(List<CourseAttribute> programCourses) {
        this.programCourses = programCourses;
    }

    public List<CourseAttribute> getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(List<CourseAttribute> electiveCourses) {
        this.electiveCourses = electiveCourses;
    }
}

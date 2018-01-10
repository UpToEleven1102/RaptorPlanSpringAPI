package com.raptorplan.raptorplan.model.request;

import com.raptorplan.raptorplan.model.IdHolder;

import java.util.List;

public class McAdvisingTemplateRequest {
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

    private List<IdHolder> institutionalAttributes;

    private List<IdHolder> englCourses;

    private List<IdHolder> mathCourses;

    private List<IdHolder> speechCourses;

    private List<IdHolder> artCourses;

    private List<IdHolder> behavioralCourses;

    private List<IdHolder> humanCourses;

    private List<IdHolder> scienceCourses;

    private List<IdHolder> scienceLabCourses;

    private List<IdHolder> programCourses;

    private List<IdHolder> electiveCourses;

    public McAdvisingTemplateRequest(){}

    public McAdvisingTemplateRequest(String major, Integer enFoundationCredit, Integer mathFoundationCredit, Integer speechFoundationCredit, Integer artDistributionCredit, Integer behavioralDistributionCredit, Integer humanDistributionCredit, Integer scienceDistributionCredit, Integer scienceLabDistributionCredit, Integer programCredit, Integer electivesCredit, Integer institutionalCredit, List<IdHolder> institutionalAttributes, List<IdHolder> englCourses, List<IdHolder> mathCourses, List<IdHolder> speechCourses, List<IdHolder> artCourses, List<IdHolder> behavioralCourses, List<IdHolder> humanCourses, List<IdHolder> scienceCourses, List<IdHolder> scienceLabCourses, List<IdHolder> programCourses, List<IdHolder> electiveCourses) {
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

    public List<IdHolder> getInstitutionalAttributes() {
        return institutionalAttributes;
    }

    public void setInstitutionalAttributes(List<IdHolder> institutionalAttributes) {
        this.institutionalAttributes = institutionalAttributes;
    }

    public List<IdHolder> getEnglCourses() {
        return englCourses;
    }

    public void setEnglCourses(List<IdHolder> englCourses) {
        this.englCourses = englCourses;
    }

    public List<IdHolder> getMathCourses() {
        return mathCourses;
    }

    public void setMathCourses(List<IdHolder> mathCourses) {
        this.mathCourses = mathCourses;
    }

    public List<IdHolder> getSpeechCourses() {
        return speechCourses;
    }

    public void setSpeechCourses(List<IdHolder> speechCourses) {
        this.speechCourses = speechCourses;
    }

    public List<IdHolder> getArtCourses() {
        return artCourses;
    }

    public void setArtCourses(List<IdHolder> artCourses) {
        this.artCourses = artCourses;
    }

    public List<IdHolder> getBehavioralCourses() {
        return behavioralCourses;
    }

    public void setBehavioralCourses(List<IdHolder> behavioralCourses) {
        this.behavioralCourses = behavioralCourses;
    }

    public List<IdHolder> getHumanCourses() {
        return humanCourses;
    }

    public void setHumanCourses(List<IdHolder> humanCourses) {
        this.humanCourses = humanCourses;
    }

    public List<IdHolder> getScienceCourses() {
        return scienceCourses;
    }

    public void setScienceCourses(List<IdHolder> scienceCourses) {
        this.scienceCourses = scienceCourses;
    }

    public List<IdHolder> getScienceLabCourses() {
        return scienceLabCourses;
    }

    public void setScienceLabCourses(List<IdHolder> scienceLabCourses) {
        this.scienceLabCourses = scienceLabCourses;
    }

    public List<IdHolder> getProgramCourses() {
        return programCourses;
    }

    public void setProgramCourses(List<IdHolder> programCourses) {
        this.programCourses = programCourses;
    }

    public List<IdHolder> getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(List<IdHolder> electiveCourses) {
        this.electiveCourses = electiveCourses;
    }
}

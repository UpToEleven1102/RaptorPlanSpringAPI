package com.raptorplan.raptorplan.model.academic_template.category;

import com.raptorplan.raptorplan.model.academic_template.*;

public class DistributionCategory {
    private Integer id;
    private ArtDistribution artDistribution;
    private BehavioralSocialDistribution behavioralSocialDistribution;
    private HumanitiesDistribution humanitiesDistribution;
    private NaturalScienceLabDistribution naturalScienceLabDistribution;
    private NaturalScienceDistribution naturalScienceDistribution;
    private InstitutionalDistribution institutionalDistribution;

    public DistributionCategory() {
    }

    public DistributionCategory(Integer id, ArtDistribution artDistribution, BehavioralSocialDistribution behavioralSocialDistribution, HumanitiesDistribution humanitiesDistribution, NaturalScienceLabDistribution naturalScienceLabDistribution, NaturalScienceDistribution naturalScienceDistribution, InstitutionalDistribution institutionalDistribution) {
        this.id = id;
        this.artDistribution = artDistribution;
        this.behavioralSocialDistribution = behavioralSocialDistribution;
        this.humanitiesDistribution = humanitiesDistribution;
        this.naturalScienceLabDistribution = naturalScienceLabDistribution;
        this.naturalScienceDistribution = naturalScienceDistribution;
        this.institutionalDistribution = institutionalDistribution;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArtDistribution getArtDistribution() {
        return artDistribution;
    }

    public void setArtDistribution(ArtDistribution artDistribution) {
        this.artDistribution = artDistribution;
    }

    public BehavioralSocialDistribution getBehavioralSocialDistribution() {
        return behavioralSocialDistribution;
    }

    public void setBehavioralSocialDistribution(BehavioralSocialDistribution behavioralSocialDistribution) {
        this.behavioralSocialDistribution = behavioralSocialDistribution;
    }

    public HumanitiesDistribution getHumanitiesDistribution() {
        return humanitiesDistribution;
    }

    public void setHumanitiesDistribution(HumanitiesDistribution humanitiesDistribution) {
        this.humanitiesDistribution = humanitiesDistribution;
    }

    public NaturalScienceLabDistribution getNaturalScienceLabDistribution() {
        return naturalScienceLabDistribution;
    }

    public void setNaturalScienceLabDistribution(NaturalScienceLabDistribution naturalScienceLabDistribution) {
        this.naturalScienceLabDistribution = naturalScienceLabDistribution;
    }

    public NaturalScienceDistribution getNaturalScienceDistribution() {
        return naturalScienceDistribution;
    }

    public void setNaturalScienceDistribution(NaturalScienceDistribution naturalScienceDistribution) {
        this.naturalScienceDistribution = naturalScienceDistribution;
    }

    public InstitutionalDistribution getInstitutionalDistribution() {
        return institutionalDistribution;
    }

    public void setInstitutionalDistribution(InstitutionalDistribution institutionalDistribution) {
        this.institutionalDistribution = institutionalDistribution;
    }
}

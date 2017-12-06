package com.raptorplan.RaptorPlan.model.academic_template.category;

import com.raptorplan.RaptorPlan.model.academic_template.EnglishFoundation;
import com.raptorplan.RaptorPlan.model.academic_template.MathFoundation;
import com.raptorplan.RaptorPlan.model.academic_template.SpeechFoundation;

public class FoundationCategory {
    private Integer id;
    private EnglishFoundation englishFoundation;
    private MathFoundation mathFoundation;
    private SpeechFoundation speechFoundation;

    public FoundationCategory() {}

    public FoundationCategory(Integer id, EnglishFoundation englishFoundation, MathFoundation mathFoundation, SpeechFoundation speechFoundation) {
        this.id = id;
        this.englishFoundation = englishFoundation;
        this.mathFoundation = mathFoundation;
        this.speechFoundation = speechFoundation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EnglishFoundation getEnglishFoundation() {
        return englishFoundation;
    }

    public void setEnglishFoundation(EnglishFoundation englishFoundation) {
        this.englishFoundation = englishFoundation;
    }

    public MathFoundation getMathFoundation() {
        return mathFoundation;
    }

    public void setMathFoundation(MathFoundation mathFoundation) {
        this.mathFoundation = mathFoundation;
    }

    public SpeechFoundation getSpeechFoundation() {
        return speechFoundation;
    }

    public void setSpeechFoundation(SpeechFoundation speechFoundation) {
        this.speechFoundation = speechFoundation;
    }
}

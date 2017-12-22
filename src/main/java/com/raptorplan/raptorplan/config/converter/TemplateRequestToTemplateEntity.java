package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.TemplateEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.CourseRepository;
import com.raptorplan.raptorplan.data.repository.TemplateRepository;
import com.raptorplan.raptorplan.model.request.TemplateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class TemplateRequestToTemplateEntity implements Converter<TemplateRequest,TemplateEntity>{

    @Override
    public TemplateEntity convert(TemplateRequest source) {
        TemplateEntity entity = new TemplateEntity();
        entity.setArtDistributionCredit(source.getArtDistributionCredit());
        entity.setBehavioralDistributionCredit(source.getBehavioralDistributionCredit());
        entity.setElectivesCredit(source.getElectivesCredit());
        entity.setEnFoundationCredit(source.getEnFoundationCredit());
        entity.setHumanDistributionCredit(source.getHumanDistributionCredit());
        entity.setScienceDistributionCredit(source.getScienceDistributionCredit());
        entity.setScienceLabDistributionCredit(source.getScienceLabDistributionCredit());
        entity.setInstitutionalCredit(source.getInstitutionalCredit());
        entity.setMajor(source.getMajor());
        entity.setMathFoundationCredit(source.getMathFoundationCredit());
        entity.setProgramCredit(source.getProgramCredit());
        entity.setSpeechFoundationCredit(source.getSpeechFoundationCredit());
        return entity;
    }
}

package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.UniversityEntityToUniversityResponse;
import com.raptorplan.raptorplan.data.entity.UniversityEntity;
import com.raptorplan.raptorplan.data.repository.UniversityRepository;
import com.raptorplan.raptorplan.model.request.UniversityRequest;
import com.raptorplan.raptorplan.model.response.UniversityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    private UniversityRepository repoUniversity;
    private ConversionService conversionService;

    @Autowired
    public UniversityService(UniversityRepository repoUniversity, ConversionService conversionService){
        this.repoUniversity = repoUniversity;
        this.conversionService = conversionService;
    }

    public UniversityResponse create(UniversityRequest requestBody){
        UniversityEntity entity = conversionService.convert(requestBody, UniversityEntity.class);
        repoUniversity.save(entity);
        return conversionService.convert(entity, UniversityResponse.class);
    }

    public UniversityResponse get(Long id){
        UniversityEntity entity = repoUniversity.findOne(id);
        return conversionService.convert(entity,UniversityResponse.class);
    }

    public List<UniversityResponse> getAll(){
        List<UniversityEntity> entities = Lists.newArrayList(repoUniversity.findAll());
        return Lists.newArrayList(new PageImpl<UniversityEntity>(entities).map(new UniversityEntityToUniversityResponse()));
    }

    public void delete(Long id){
        repoUniversity.delete(id);
    }
}

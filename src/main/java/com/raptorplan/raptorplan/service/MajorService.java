package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.MajorEntityToMajorResponse;
import com.raptorplan.raptorplan.data.entity.MajorEntity;
import com.raptorplan.raptorplan.data.repository.MajorRepository;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.customObject.MajorCustom;
import com.raptorplan.raptorplan.model.request.MajorRequest;
import com.raptorplan.raptorplan.model.response.MajorResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService {
    private MajorRepository repoMajor;
    private ConversionService conversionService;

    @Autowired
    public MajorService(MajorRepository repoMajor, ConversionService conversionService){
        this.repoMajor = repoMajor;
        this.conversionService = conversionService;
    }

    public MajorResponse create(MajorRequest request){
        MajorEntity entity = conversionService.convert(request,MajorEntity.class);
        repoMajor.save(entity);
        return conversionService.convert(entity, MajorResponse.class);
    }

    public List<MajorCustom> getAll(){
        List<MajorCustom> response = repoMajor.getAll();
        response.forEach(e -> {
            Links links = new Links();
            Self self = new Self();
            self.setRef(ResourceConstant.MAJOR_PATH + "/" + e.getId());
            links.setSelf(self);
            e.setLinks(links);
        });
        return response;
    }

    public MajorResponse getMajor(Long id){
        return conversionService.convert(this.repoMajor.findOne(id),MajorResponse.class);
    }
}

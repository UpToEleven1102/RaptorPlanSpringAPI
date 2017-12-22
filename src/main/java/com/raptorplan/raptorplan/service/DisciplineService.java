package com.raptorplan.raptorplan.service;

import com.google.common.collect.Lists;
import com.raptorplan.raptorplan.config.converter.DisciplineEntityToDisciplineResponse;
import com.raptorplan.raptorplan.data.entity.DisciplineEntity;
import com.raptorplan.raptorplan.data.repository.DisciplineRepository;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.customObject.DisciplineCustom;
import com.raptorplan.raptorplan.model.request.DisciplineRequest;
import com.raptorplan.raptorplan.model.response.DisciplineResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisciplineService {
    private DisciplineRepository repoDiscipline;
    private ConversionService service;

    @Autowired
    public DisciplineService(DisciplineRepository repoDiscipline, ConversionService conversionService){
        this.repoDiscipline = repoDiscipline;
        this.service = conversionService;
    }

    public List<DisciplineCustom> getAll(){
//        List<DisciplineResponse> response = new ArrayList<>();
//        Page<DisciplineResponse> pageResponse = new PageImpl<DisciplineEntity>(Lists.newArrayList(repoDiscipline.findAll())).map(new DisciplineEntityToDisciplineResponse());
//        pageResponse.forEach(e -> {
//            response.add(e);
//        });
        List<DisciplineCustom> disciplines = repoDiscipline.getDisciplineList();
        disciplines.forEach(e->{
            Links links = new Links();
            Self self = new Self();
            self.setRef(ResourceConstant.DISCIPLINE_PATH+"/"+e.getCode());
            links.setSelf(self);
            e.setLinks(links);
        });
        return disciplines;
    }

    public DisciplineResponse create(DisciplineRequest requestObj){
        DisciplineEntity entity = this.service.convert(requestObj,DisciplineEntity.class);
        repoDiscipline.save(entity);
        DisciplineResponse response = this.service.convert(entity,DisciplineResponse.class);
        return response;
    }


    public DisciplineResponse getByCode(String code){
        return service.convert(repoDiscipline.findByCode(code),DisciplineResponse.class);
    }

    public void delete(Long id){
        repoDiscipline.delete(id);
    }
}

package com.raptorplan.raptorplan.auth.service;

import com.raptorplan.raptorplan.auth.model.RoleEntity;
import com.raptorplan.raptorplan.auth.model.custom.RoleCustom;
import com.raptorplan.raptorplan.auth.model.request.RoleRequest;
import com.raptorplan.raptorplan.auth.model.response.RoleResponse;
import com.raptorplan.raptorplan.auth.model.response.UserResponse;
import com.raptorplan.raptorplan.auth.repository.RoleRepository;
import com.raptorplan.raptorplan.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    private RoleRepository repoRole;
    private UserRepository repoUser;
    private ConversionService conversionService;

    @Autowired
    public RoleService(RoleRepository repoRole, ConversionService conversionService, UserRepository repoUser) {
        this.repoRole = repoRole;
        this.repoUser = repoUser;
        this.conversionService = conversionService;
    }

    public RoleResponse create(RoleRequest requestBody) {
        RoleEntity entity = conversionService.convert(requestBody,RoleEntity.class);
        repoRole.save(entity);
        return conversionService.convert(entity,RoleResponse.class);
    }

    public RoleResponse getById(Long id){
        RoleEntity entity = repoRole.findOne(id);
        RoleResponse response = conversionService.convert(entity, RoleResponse.class);
        List<UserResponse> userResponses = new ArrayList<>();
        entity.getUsers().forEach(user -> {
            userResponses.add(conversionService.convert(user,UserResponse.class));
        });

        response.setUsers(userResponses);
        return response;
    }

    public List<RoleCustom> getAll(){
        List<RoleCustom> response = new ArrayList<>();
        repoRole.findAll().forEach(roleEntity -> {
            response.add(conversionService.convert(roleEntity,RoleCustom.class));
        });

        return response;
    }

}

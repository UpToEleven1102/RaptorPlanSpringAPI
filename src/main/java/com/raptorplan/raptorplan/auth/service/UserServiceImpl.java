package com.raptorplan.raptorplan.auth.service;

import com.raptorplan.raptorplan.auth.model.RoleEntity;
import com.raptorplan.raptorplan.auth.model.UserEntity;
import com.raptorplan.raptorplan.auth.model.request.UserRequest;
import com.raptorplan.raptorplan.auth.model.response.UserResponse;
import com.raptorplan.raptorplan.auth.repository.RoleRepository;
import com.raptorplan.raptorplan.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository repoUser;
    private RoleRepository repoRole;
    private ConversionService conversionService;

    @Autowired
    public UserServiceImpl(UserRepository repoUser, RoleRepository repoRole, ConversionService conversionService) {
        this.repoUser = repoUser;
        this.repoRole = repoRole;
        this.conversionService = conversionService;
    }

    @Override
    public UserResponse save(UserRequest userRequest) {
        UserEntity entity = conversionService.convert(userRequest, UserEntity.class);
        List<RoleEntity> roles = new ArrayList<>();
        userRequest.getRoles().forEach(role -> {
            roles.add(repoRole.findOne(role));
        });
        entity.setRoles(roles);
        repoUser.save(entity);
        return conversionService.convert(entity, UserResponse.class);
    }

    @Override
    public UserResponse findByEmail(String email) {
        UserEntity entity = repoUser.findByEmail(email);
        return conversionService.convert(entity, UserResponse.class);
    }

    @Override
    public void delete(String email) {
        UserEntity entity = repoUser.findByEmail(email);
        repoUser.delete(entity);
    }
}

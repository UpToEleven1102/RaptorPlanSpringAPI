package com.raptorplan.raptorplan.auth.converter;

import com.raptorplan.raptorplan.auth.model.RoleEntity;
import com.raptorplan.raptorplan.auth.model.response.RoleResponse;
import com.raptorplan.raptorplan.auth.model.response.UserResponse;
import com.raptorplan.raptorplan.auth.repository.UserRepository;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class RoleEntityToRoleResponse implements Converter<RoleEntity,RoleResponse>{
    UserEntityToUserResponseConverter converter = new UserEntityToUserResponseConverter();

    @Override
    public RoleResponse convert(RoleEntity source) {
        RoleResponse response = new RoleResponse();
        response.setId(source.getId());
        response.setName(source.getName());
        return response;
    }
}

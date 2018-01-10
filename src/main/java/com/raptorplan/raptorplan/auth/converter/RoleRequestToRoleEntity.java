package com.raptorplan.raptorplan.auth.converter;

import com.raptorplan.raptorplan.auth.model.RoleEntity;
import com.raptorplan.raptorplan.auth.model.request.RoleRequest;
import org.springframework.core.convert.converter.Converter;

public class RoleRequestToRoleEntity implements Converter<RoleRequest,RoleEntity> {

    @Override
    public RoleEntity convert(RoleRequest source) {
        RoleEntity entity = new RoleEntity();
        entity.setName(source.getName());
        return entity;
    }
}

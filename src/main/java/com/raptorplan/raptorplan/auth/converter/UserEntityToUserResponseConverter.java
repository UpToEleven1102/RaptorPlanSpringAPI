package com.raptorplan.raptorplan.auth.converter;

import com.raptorplan.raptorplan.auth.model.UserEntity;
import com.raptorplan.raptorplan.auth.model.custom.RoleCustom;
import com.raptorplan.raptorplan.auth.model.response.UserResponse;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class UserEntityToUserResponseConverter implements Converter<UserEntity,UserResponse> {
    private RoleEntityToRoleCustom converter = new RoleEntityToRoleCustom();
    @Override
    public UserResponse convert(UserEntity source) {
        UserResponse response = new UserResponse();
        response.setId(source.getId());
        response.setFirstName(source.getName());
        response.setLastName(source.getLastName());
        response.setmNumber(source.getmNumber());
        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.USER_PATH+"/"+ source.getId());
        links.setSelf(self);
        response.setLinks(links);

        List<RoleCustom> roleResponses = new ArrayList<>();
        source.getRoles().forEach(roleEntity -> {
            roleResponses.add(converter.convert(roleEntity));
        });

        response.setRoles(roleResponses);
        return response;
    }
}

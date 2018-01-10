package com.raptorplan.raptorplan.auth.converter;

import com.raptorplan.raptorplan.auth.model.RoleEntity;
import com.raptorplan.raptorplan.auth.model.custom.RoleCustom;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;

public class RoleEntityToRoleCustom implements Converter<RoleEntity, RoleCustom> {
    @Override
    public RoleCustom convert(RoleEntity source) {
        RoleCustom response = new RoleCustom();
        response.setId(source.getId());
        response.setName(source.getName());

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.ROLE_PATH+"/"+source.getId());
        links.setSelf(self);

        response.setLinks(links);
        return response;
    }
}

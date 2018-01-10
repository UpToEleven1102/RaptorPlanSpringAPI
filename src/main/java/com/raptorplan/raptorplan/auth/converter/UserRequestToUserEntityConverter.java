package com.raptorplan.raptorplan.auth.converter;

import com.raptorplan.raptorplan.auth.model.UserEntity;
import com.raptorplan.raptorplan.auth.model.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserRequestToUserEntityConverter implements Converter<UserRequest,UserEntity> {
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Override
    public UserEntity convert(UserRequest source) {
        UserEntity user = new UserEntity();
        user.setName(source.getName());
        user.setLastName(source.getLastName());
        user.setEmail(source.getEmail());
        user.setmNumber(source.getmNumber());
        user.setPassword(this.passwordEncoder.encode(source.getPassword()));
        return user;
    }
}

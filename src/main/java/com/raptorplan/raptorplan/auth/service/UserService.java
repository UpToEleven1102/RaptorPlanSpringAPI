package com.raptorplan.raptorplan.auth.service;

import com.raptorplan.raptorplan.auth.model.UserEntity;
import com.raptorplan.raptorplan.auth.model.request.UserRequest;
import com.raptorplan.raptorplan.auth.model.response.UserResponse;

public interface UserService {
    public UserResponse save(UserRequest userRequest);

    public UserResponse findByEmail(String email);

    public void delete(String email);
}

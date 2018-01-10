package com.raptorplan.raptorplan.auth.config;

import com.raptorplan.raptorplan.auth.model.UserEntity;

public class Authz {
    public boolean check(Long userId, UserEntity user) {
        return userId.equals(user.getId());
    }
}

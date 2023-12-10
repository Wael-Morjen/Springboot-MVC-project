package com.waelmorjen.events.repository;

import com.waelmorjen.events.models.UserEntity;

public interface UserRepository {
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}

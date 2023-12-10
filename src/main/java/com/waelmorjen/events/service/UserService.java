package com.waelmorjen.events.service;

import com.waelmorjen.events.dto.RegistrationDto;
import com.waelmorjen.events.models.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}

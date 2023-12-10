package com.waelmorjen.events.service.impl;

import com.waelmorjen.events.dto.RegistrationDto;
import com.waelmorjen.events.models.Role;
import com.waelmorjen.events.models.UserEntity;
import com.waelmorjen.events.repository.RoleRepository;
import com.waelmorjen.events.repository.UserRepository;
import com.waelmorjen.events.service.UserService;

import java.util.Arrays;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        UserEntity user = new UserEntity();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("USER");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

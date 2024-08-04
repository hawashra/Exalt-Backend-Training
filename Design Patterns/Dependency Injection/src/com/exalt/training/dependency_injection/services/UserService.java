package com.exalt.training.dependency_injection.services;

import com.exalt.training.dependency_injection.entities.User;
import com.exalt.training.dependency_injection.userrepo.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(int id) {
        return userRepository.findUserById(id);
    }
}
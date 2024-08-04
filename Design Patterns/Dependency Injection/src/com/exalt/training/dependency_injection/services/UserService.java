package com.exalt.training.dependency_injection.services;

import com.exalt.training.dependency_injection.entities.User;
import com.exalt.training.dependency_injection.userrepo.UserRepository;

/**
 * The UserService class has a user repository filed,
 * which can be any class that implements the UserRepository interface
 * if we want to have the same service but with different implementation,
 * we can create the same service with a different UserRepository
 * that has the different implementation, this way, we remove the coupling between
 * the classes, and also we achieve the open-closed principle as we can add a different
 * implementation for finding the user without changing the current classes codes.
 *
 * */

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
package com.exalt.training.restMaven.services;

import com.exalt.training.restMaven.Models.User;
import com.exalt.training.restMaven.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public Optional<User> getUser(Long id) {
        return userRepo.findById(id);
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(Long id, User userDetails) {

        User user = userRepo.findById(id).orElseThrow();
        user.setId(userDetails.getId());
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setEmail(userDetails.getEmail());
        user.setAge(userDetails.getAge());

        return userRepo.save(user);
    }

}

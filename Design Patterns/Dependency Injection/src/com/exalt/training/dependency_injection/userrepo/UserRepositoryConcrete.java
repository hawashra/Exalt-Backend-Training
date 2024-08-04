package com.exalt.training.dependency_injection.userrepo;

import com.exalt.training.dependency_injection.entities.User;

public class UserRepositoryConcrete implements UserRepository {

    @Override
    public User findUserById(int id) {
        // get services from database..

        return new User(id, "Hamza Awashra");
    }
}

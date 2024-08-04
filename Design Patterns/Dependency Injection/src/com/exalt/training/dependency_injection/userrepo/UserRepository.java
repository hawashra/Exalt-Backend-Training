package com.exalt.training.dependency_injection.userrepo;

import com.exalt.training.dependency_injection.entities.User;

public interface UserRepository {
    User findUserById(int id);
}


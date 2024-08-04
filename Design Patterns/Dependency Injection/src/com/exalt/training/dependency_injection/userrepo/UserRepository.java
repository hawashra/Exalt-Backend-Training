package com.exalt.training.dependency_injection.userrepo;

import com.exalt.training.dependency_injection.entities.User;

// user repo contains some logic that we can do on the User class instances.

public interface UserRepository {

    /** return the user with the given Id.
     *  The implementation is left for the concrete classes,
     *  we can query the user in a DB for example.
     */
    User findUserById(int id);
}


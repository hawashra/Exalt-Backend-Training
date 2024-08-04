package com.exalt.training.dependency_injection.userrepo;

import com.exalt.training.dependency_injection.entities.User;

public class UserRepositoryConcrete implements UserRepository {

    @Override
    public User findUserById(int id) {
        /*
        * logic to search for the user in a DB or a list of users.
        *
        *  implementation might vary for different DB's or datastructures
        *  used to hold the user's information.
        * */


        /* for this simple example, we are only interested in outlining the
           design pattern overall structure and not specific implementations,
            thus we return a new user for simplicity. */
        return new User(id, "Hamza Awashra");
    }
}

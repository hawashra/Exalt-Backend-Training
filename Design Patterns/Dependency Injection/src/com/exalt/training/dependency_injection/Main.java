package com.exalt.training.dependency_injection;

import com.exalt.training.dependency_injection.entities.User;
import com.exalt.training.dependency_injection.services.UserService;
import com.exalt.training.dependency_injection.userrepo.UserRepositoryConcrete;

public class Main {
    public static void main(String[] args) {

        UserRepositoryConcrete userRepositoryConcrete = new UserRepositoryConcrete();
        UserService userService = new UserService(userRepositoryConcrete);
        User user = userService.getUser(1);
        System.out.println(user);

    }
}
package com.exalt.training.restMaven.Controller;

import com.exalt.training.restMaven.Models.User;
import com.exalt.training.restMaven.Repo.UserRepo;
import com.exalt.training.restMaven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/users")
public class UserController {

 //   @Autowired
 // private UserRepo userRepo;

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    //users
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }


    //users/{id}
    @PostMapping("/users")
    public String addUser(@RequestBody User user) {

        userService.addUser(user);
        return "User created successfully";
    }

    //users/{id}
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {

       return userService.updateUser(id, user);
    }

    //users/{id}
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
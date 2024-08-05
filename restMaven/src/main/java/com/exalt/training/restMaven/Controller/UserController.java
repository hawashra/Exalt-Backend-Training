package com.exalt.training.restMaven.Controller;

import com.exalt.training.restMaven.Models.User;
import com.exalt.training.restMaven.Repo.UserRepo;
import com.exalt.training.restMaven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

 //   @Autowired
 // private UserRepo userRepo;

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    /*
    @PostMapping
    public String saveUser(@RequestBody User user) {


        return "Saved.";
    }
    */

    @PutMapping("update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {

       return userService.updateUser(id, user);
    }
}

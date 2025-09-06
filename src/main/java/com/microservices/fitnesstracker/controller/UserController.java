package com.microservices.fitnesstracker.controller;

import com.microservices.fitnesstracker.model.User;
import com.microservices.fitnesstracker.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping ("/users")
    public List<User> getUser(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody User user){
        userService.deleteUser(user);
    }

    @DeleteMapping("/deleteUsers")
    public void deleteAllUser(){
        userService.deleteAllUsers();
    }

}

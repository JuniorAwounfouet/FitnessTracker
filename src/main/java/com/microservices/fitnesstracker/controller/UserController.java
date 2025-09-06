package com.microservices.fitnesstracker.controller;

import com.microservices.fitnesstracker.dto.UserDTO;
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

    @PostMapping("/createUsers")
    public List<User> createUsers(@RequestBody List<User> users){
        return userService.createUsers(users);
    }

    @GetMapping ("/users")
    public List<User> getUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody User user){
        userService.deleteUser(user);
    }

    @DeleteMapping("/deleteUsers")
    public void deleteAllUser(){
        userService.deleteAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }

}

package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User createUser(User user);
    public User getUserById(Long id);
    public List<User> getAllUsers();
//    public User updateUser(User user);
    public void deleteUser(User user);
    public void deleteAllUsers();

}

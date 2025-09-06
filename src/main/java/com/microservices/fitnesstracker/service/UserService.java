package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.dto.UserDTO;
import com.microservices.fitnesstracker.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    public User createUser(User user);
    public List<User> createUsers(List<User> users);
    public User getUserById(Long id);
    public List<User> getAllUsers();
    public User updateUser(Long id, User user);
    public void deleteUser(User user);
    public void deleteAllUsers();
    public void deleteUserById(Long id);

}

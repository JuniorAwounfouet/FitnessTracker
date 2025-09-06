package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.model.User;
import com.microservices.fitnesstracker.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

//    @Override
//    public User updateUser(User user) {
//
//        userRepository.findById(user.getId()).map(
//                user1 -> user.setUsername(user.getUsername())
//        )
//        getUserById(user.getId()).setUsername(user.getUsername());
//
//        return user;
//    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

}

package com.microservices.fitnesstracker.service.User;

import com.microservices.fitnesstracker.dto.UserDTO;
import com.microservices.fitnesstracker.model.Meal;
import com.microservices.fitnesstracker.model.User;
import com.microservices.fitnesstracker.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> createUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public UserDTO getUserById(Long id) {

        User user = userRepository.findById(id).orElse(null);
        return new UserDTO(user.getUsername(), user.getAge());
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, User user) {

        return  userRepository.findById(id)
                .map(user1 -> {
                    user1.setUsername(user.getUsername());
                    user1.setAge(user.getAge());
                    user1.setEmail(user.getEmail());
                    user1.setPassword(user.getPassword());
                    user1.setWeight(user.getWeight());
                    user1.setHeight(user.getHeight());
                    user1.setGender(user.getGender());
                    user1.setGoal(user.getGoal());
                    user1.setRoles(user.getRoles());
//                    user1.setWorkouts(user.getWorkouts());

                    return userRepository.save(user1);
                })
        .orElse(null);

    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<Meal> getMeals(Long id) {
        return userRepository.findById(id).get().getMeals();
    }

    // TODO rajouter une précision pour calories sur une journée
    @Override
    public double getCalories(Long id) {
        return userRepository.findById(id)
                .get()
                .getMeals()
                .stream()
                .mapToDouble(Meal::getCalories).sum();

//        return userRepository.findById(id)
//                .map(User::getMeals)
//                .map(meals -> meals.stream().mapToDouble(Meal::getCalories).sum());
    }


}

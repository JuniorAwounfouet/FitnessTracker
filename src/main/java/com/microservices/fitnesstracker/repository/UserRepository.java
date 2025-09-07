package com.microservices.fitnesstracker.repository;

import com.microservices.fitnesstracker.model.Meal;
import com.microservices.fitnesstracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

//    public List<Meal> getMeals(Long id);

}

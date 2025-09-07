package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.model.Meal;
import com.microservices.fitnesstracker.model.User;
import com.microservices.fitnesstracker.model.Workout;
import com.microservices.fitnesstracker.repository.MealRepository;
import com.microservices.fitnesstracker.repository.UserRepository;
import com.microservices.fitnesstracker.repository.WorkoutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanService {

    private WorkoutRepository workoutRepository;
    private MealRepository mealRepository;

//    public List<Workout> workoutPlan(User user) {
//
//    }
//
//    public List<Meal>  mealPlan(User user) {
//    }

}

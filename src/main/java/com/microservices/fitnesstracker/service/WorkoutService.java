package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.model.Workout;
import com.microservices.fitnesstracker.repository.WorkoutRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkoutService {

    public Workout createWorkout(Workout workout);
    public List<Workout> createWorkouts(List<Workout> workouts);
    public Workout updateWorkout(Workout workout, Long id);
    public void deleteWorkout(Workout workout);
    public void deleteWorkoutById(Long id);
    public List<Workout> getWorkouts();
    public Workout getWorkoutById(Long id);
}

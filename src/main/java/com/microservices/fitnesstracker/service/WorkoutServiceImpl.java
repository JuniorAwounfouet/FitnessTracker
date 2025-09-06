package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.model.Workout;
import com.microservices.fitnesstracker.repository.WorkoutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkoutServiceImpl implements WorkoutService {

    WorkoutRepository workoutRepository;

    @Override
    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    @Override
    public List<Workout> createWorkouts(List<Workout> workouts) {
        return workoutRepository.saveAll(workouts);
    }

    @Override
    public Workout updateWorkout(Workout workout, Long id) {
        return workoutRepository.findById(id)
                        .map(workout1 -> {
                            workout1.setDate(workout.getDate());
                            workout1.setType(workout.getType());
                            workout1.setNotes(workout.getNotes());
                            workout1.setUser(workout.getUser());
                            workout1.setExercises(workout.getExercises());

                           return workoutRepository.save(workout1);
        }).orElse(null);
    }

    @Override
    public void deleteWorkout(Workout workout) {
        workoutRepository.delete(workout);
    }

    @Override
    public void deleteWorkoutById(Long id) {
        workoutRepository.deleteById(id);
    }

    @Override
    public List<Workout> getWorkouts() {
        return workoutRepository.findAll();
    }

    @Override
    public Workout getWorkoutById(Long id) {
        return  workoutRepository.findById(id).orElse(null);
    }
}

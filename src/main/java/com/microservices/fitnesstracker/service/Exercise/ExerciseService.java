package com.microservices.fitnesstracker.service.Exercise;

import com.microservices.fitnesstracker.model.Exercise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExerciseService {

    public Exercise createExercise(Exercise exercise);
    public List<Exercise> createExercises(List<Exercise> exercises);
    public Exercise getExerciseById(Long id);
    public List<Exercise> getAllExercises();
    public Exercise updateExercise(Exercise exercise, Long id);
    public void deleteExerciseById(Long id);

}

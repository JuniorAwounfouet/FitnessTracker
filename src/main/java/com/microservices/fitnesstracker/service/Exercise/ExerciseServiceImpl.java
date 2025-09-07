package com.microservices.fitnesstracker.service.Exercise;

import com.microservices.fitnesstracker.model.Exercise;
import com.microservices.fitnesstracker.repository.ExerciseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExerciseServiceImpl implements ExerciseService {

    private ExerciseRepository exerciseRepository;

    @Override
    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public List<Exercise> createExercises(List<Exercise> exercises) {
        return exerciseRepository.saveAll(exercises);
    }

    @Override
    public Exercise getExerciseById(Long id) {
        return exerciseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise updateExercise(Exercise exercise, Long id) {
        return exerciseRepository.findById(id)
                .map(
                        exercise1 -> {
                            exercise1.setName(exercise.getName());
                            exercise1.setMuscleGroup(exercise.getMuscleGroup());
                            exercise1.setSets(exercise.getSets());
                            exercise1.setReps(exercise.getReps());
                            exercise1.setWeight(exercise.getWeight());
//                            exercise1.setWorkout(exercise.getWorkout());

                            return exerciseRepository.save(exercise1);
                        }
                ).orElse(null);
    }

    @Override
    public void deleteExerciseById(Long id) {
        exerciseRepository.deleteById(id);
    }
}

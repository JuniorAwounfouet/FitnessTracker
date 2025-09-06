package com.microservices.fitnesstracker.controller;

import com.microservices.fitnesstracker.model.Exercise;
import com.microservices.fitnesstracker.service.ExerciseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
@AllArgsConstructor
public class ExerciseController {

    private ExerciseService exerciseService;

    @PostMapping("/create")
    public Exercise createExercise(@RequestBody Exercise exercise) {
        return exerciseService.createExercise(exercise);
    }

    @PostMapping("/createExercises")
    public List<Exercise> createExercises(@RequestBody List<Exercise> exercises){
        return exerciseService.createExercises(exercises);
    }

    @GetMapping("/{id}")
    public Exercise getExercise(@PathVariable Long id){
        return exerciseService.getExerciseById(id);
    }

    @GetMapping("/exercises")
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @PutMapping("/update/{id}")
    public Exercise updateExercise(@RequestBody Exercise exercise,@PathVariable Long id) {
        return exerciseService.updateExercise(exercise, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExercise(@PathVariable Long id) {
        exerciseService.deleteExerciseById(id);
    }

}

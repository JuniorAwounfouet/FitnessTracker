package com.microservices.fitnesstracker.controller;

import com.microservices.fitnesstracker.model.Workout;
import com.microservices.fitnesstracker.service.Workout.WorkoutService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout")
@AllArgsConstructor
public class WorkoutController {

    private final WorkoutService workoutService;

    @PostMapping("/create")
    public Workout createWorkout(@RequestBody Workout workout){
        return workoutService.createWorkout(workout);
    }

    @PostMapping("/createWorkouts")
    public List<Workout> createWorkouts(@RequestBody List<Workout> workouts){
        return workoutService.createWorkouts(workouts);
    }

    @GetMapping("/workouts")
    public List<Workout> getWorkouts(){
        return workoutService.getWorkouts();
    }

    @GetMapping("/{id}")
    public Workout getWorkoutById(@PathVariable Long id){
        return workoutService.getWorkoutById(id);
    }

    @PutMapping("/update/{id}")
    public Workout updateWorkout(@PathVariable Long id, @RequestBody Workout workout){
        return workoutService.updateWorkout(workout,id);
    }

    @DeleteMapping("/delete")
    public void deleteWorkout(@RequestBody Workout workout){
        workoutService.deleteWorkout(workout);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWorkoutById(@PathVariable Long id){
        workoutService.deleteWorkoutById(id);
    }

}

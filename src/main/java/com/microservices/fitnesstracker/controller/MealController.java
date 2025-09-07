package com.microservices.fitnesstracker.controller;

import com.microservices.fitnesstracker.model.Meal;
import com.microservices.fitnesstracker.service.Meal.MealService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meal")
@AllArgsConstructor
public class MealController {

    private MealService mealService;

    @PostMapping("/create")
    public Meal createMeal(@RequestBody Meal meal) {
        return mealService.createMeal(meal);
    }

    @PostMapping("/createMeals")
    public List<Meal> createMeals(@RequestBody List<Meal> meals) {
        return mealService.createMeals(meals);
    }

    @GetMapping("/{id}")
    public Meal getMealById(@PathVariable Long id) {
       return mealService.findById(id);
    }

    @PutMapping("/update/{id}")
    public Meal saveMeal(@RequestBody Meal meal, @PathVariable Long id) {
        return mealService.updateMeal(meal, id);
    }

    @GetMapping("/meals")
    public List<Meal> findAll() {
        return mealService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMealById(@PathVariable Long id) {
        mealService.deleteMeal(id);
    }
}

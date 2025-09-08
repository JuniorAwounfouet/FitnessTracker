package com.microservices.fitnesstracker.service.Meal;

import com.microservices.fitnesstracker.model.Meal;
import com.microservices.fitnesstracker.model.MealComposition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MealService {

    public Meal createMeal(Meal meal);
    public List<Meal> createMeals(List<Meal> meals);
    public Meal updateMeal(Meal meal, Long id);
    public Meal findById(long id);
    public List<Meal> findAll();
    public void deleteMeal(Long id);
    public MealComposition findMealComposition(Long id);

}

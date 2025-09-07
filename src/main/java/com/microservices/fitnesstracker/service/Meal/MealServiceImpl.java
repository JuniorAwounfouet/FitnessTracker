package com.microservices.fitnesstracker.service.Meal;

import com.microservices.fitnesstracker.model.Meal;
import com.microservices.fitnesstracker.repository.MealRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {

    private MealRepository mealRepository;


    @Override
    public Meal createMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    @Override
    public List<Meal> createMeals(List<Meal> meals) {
        return mealRepository.saveAll(meals);
    }

    @Override
    public Meal updateMeal(Meal meal, Long id) {
        return mealRepository.findById(id)
                .map( meal1 -> {
                    meal1.setName(meal.getName());
                    meal1.setDate(meal.getDate());
                    meal1.setCalories(meal.getCalories());
                    meal1.setProtein(meal.getProtein());
                    meal1.setCarbs(meal.getCarbs());
                    meal1.setFats(meal.getFats());
//                    meal1.setGoal(meal.getGoal());
//                    meal1.setUser(meal.getUser());

                    return mealRepository.save(meal1);
                }).orElse(null);
    }

    @Override
    public Meal findById(long id) {
        return mealRepository.findById(id).orElse(null);
    }

    @Override
    public List<Meal> findAll() {
        return mealRepository.findAll();
    }

    @Override
    public void deleteMeal(Long id) {
        mealRepository.deleteById(id);
    }
}

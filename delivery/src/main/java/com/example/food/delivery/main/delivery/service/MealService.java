package com.example.food.delivery.main.delivery.service;

import com.example.food.delivery.main.delivery.model.Meal;
import com.example.food.delivery.main.delivery.repository.MealRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private final MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public Meal addMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public void deleteMeal(Long id) {
        mealRepository.deleteById(id);
    }

    public Meal updateMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    public Meal getMealById(Long id) {
        return mealRepository.findById(id).orElse(null);
    }

    public List<Meal> getMealsByCookId(Long cookId) {
        return mealRepository.findByCookId(cookId);
    }
}

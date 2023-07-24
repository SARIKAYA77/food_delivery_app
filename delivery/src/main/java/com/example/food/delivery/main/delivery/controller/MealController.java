package com.example.food.delivery.main.delivery.controller;

import com.example.food.delivery.main.delivery.model.Meal;
import com.example.food.delivery.main.delivery.service.MealService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealController {
    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @PostMapping("/add")
    public Meal addMeal(@RequestBody Meal meal) {
        return mealService.addMeal(meal);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMeal(@PathVariable Long id) {
        mealService.deleteMeal(id);
    }

    @PutMapping("/update")
    public Meal updateMeal(@RequestBody Meal meal) {
        return mealService.updateMeal(meal);
    }

    @GetMapping("/all")
    public List<Meal> getAllMeals() {
        return mealService.getAllMeals();
    }

    @GetMapping("/{id}")
    public Meal getMealById(@PathVariable Long id) {
        return mealService.getMealById(id);
    }

    @GetMapping("/bycook/{cookId}")
    public List<Meal> getMealsByCookId(@PathVariable Long cookId) {
        return mealService.getMealsByCookId(cookId);
    }
}

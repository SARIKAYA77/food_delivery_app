package com.example.food.delivery.main.delivery.repository;

import com.example.food.delivery.main.delivery.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    List<Meal> findByCookId(Long cookId);
}

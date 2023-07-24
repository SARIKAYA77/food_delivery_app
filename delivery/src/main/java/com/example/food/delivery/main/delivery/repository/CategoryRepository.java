package com.example.food.delivery.main.delivery.repository;

import com.example.food.delivery.main.delivery.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.example.food.delivery.main.delivery.repository;

import com.example.food.delivery.main.delivery.model.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookRepository extends JpaRepository<Cook, Long> {
}

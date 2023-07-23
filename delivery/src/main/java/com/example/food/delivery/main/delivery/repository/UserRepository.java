package com.example.food.delivery.main.delivery.repository;
import com.example.food.delivery.main.delivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

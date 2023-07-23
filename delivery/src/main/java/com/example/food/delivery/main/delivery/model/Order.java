package com.example.food.delivery.main.delivery.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalPrice;

    private LocalDateTime deliveryTime;

    private String status;

    private LocalDateTime orderTime;

    // Sipariş miktarı
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category selectedCategory;


    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;
    @ManyToOne
    @JoinColumn(name = "cook_id")
    private Cook cook;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}

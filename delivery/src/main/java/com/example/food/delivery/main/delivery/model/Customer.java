package com.example.food.delivery.main.delivery.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerSpecificField;

    @OneToOne
    private User user;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}

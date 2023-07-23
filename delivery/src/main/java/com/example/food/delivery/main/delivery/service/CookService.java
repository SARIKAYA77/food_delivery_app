package com.example.food.delivery.main.delivery.service;

import com.example.food.delivery.main.delivery.model.Cook;
import com.example.food.delivery.main.delivery.repository.CookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookService {
    private final CookRepository cookRepository;

    public CookService(CookRepository cookRepository) {
        this.cookRepository = cookRepository;
    }

    public Cook addCook(Cook cook) {
        return cookRepository.save(cook);
    }

    public void deleteCook(Long id) {
        cookRepository.deleteById(id);
    }

    public Cook updateCook(Cook cook) {
        return cookRepository.save(cook);
    }

    public List<Cook> getAllCooks() {
        return cookRepository.findAll();
    }

    public Cook getCookById(Long id) {
        return cookRepository.findById(id).orElse(null);
    }
}

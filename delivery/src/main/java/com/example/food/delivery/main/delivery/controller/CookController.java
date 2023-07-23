package com.example.food.delivery.main.delivery.controller;

import com.example.food.delivery.main.delivery.model.Cook;
import com.example.food.delivery.main.delivery.service.CookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cooks")
public class CookController {
    private final CookService cookService;

    public CookController(CookService cookService) {
        this.cookService = cookService;
    }

    @PostMapping("/add")
    public Cook addCook(@RequestBody Cook cook) {
        return cookService.addCook(cook);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCook(@PathVariable Long id) {
        cookService.deleteCook(id);
    }

    @PutMapping("/update")
    public Cook updateCook(@RequestBody Cook cook) {
        return cookService.updateCook(cook);
    }

    @GetMapping("/all")
    public List<Cook> getAllCooks() {
        return cookService.getAllCooks();
    }

    @GetMapping("/{id}")
    public Cook getCookById(@PathVariable Long id) {
        return cookService.getCookById(id);
    }
}

package com.example.foodauth.controller;

import com.example.foodauth.model.FoodItem;
import com.example.foodauth.repository.FoodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        return foodRepository.findAll();
    }

    @PostMapping
    public FoodItem addFoodItem(@RequestBody FoodItem foodItem) {
        return foodRepository.save(foodItem);
    }
}

package com.example.foodauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foodauth.model.FoodItem;

public interface FoodRepository extends JpaRepository<FoodItem, Long> {
}

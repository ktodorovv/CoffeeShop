package com.coffee.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.shop.entities.menuitems.Food;

public interface FoodRepository extends JpaRepository<Food, String>{

}

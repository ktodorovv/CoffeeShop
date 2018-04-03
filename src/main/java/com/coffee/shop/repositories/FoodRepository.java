package com.coffee.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.shop.entities.menuitems.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, String>{

}

package com.coffee.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.shop.entities.ingredients.BaseIngredient;

public interface BaseIngredientRepository extends JpaRepository<BaseIngredient, String>{

}

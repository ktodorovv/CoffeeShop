package com.coffee.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.shop.entities.ingredients.AdditionalIngredient;

public interface AdditionalIngredientRepository extends JpaRepository<AdditionalIngredient, String>{

}
package com.coffee.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.shop.entities.ingredients.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String>{

	Ingredient findOneById(String id);
	
	Ingredient findOneByName(String name);
}
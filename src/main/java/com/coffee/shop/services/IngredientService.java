package com.coffee.shop.services;

import java.util.List;

import com.coffee.shop.models.binding.ingredient.IngredientDto;
import com.coffee.shop.models.view.ingedient.IngredientView;

public interface IngredientService {

	// get all base coffee ingredients
	
	// get all base tea ingredients
	
	// get all additional tea ingredients
	
	// get all additional coffee ingrediens
	
	List<IngredientView> getAll();
	
	IngredientView getOneById(String id);
	
	IngredientView getOneByName(String name);
	
	void editAdditionalIngredient(IngredientDto ingredientDto, String id);
	
	void persist(IngredientDto ingredientDto);
	
	void removeById(String id);
}
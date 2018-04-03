package com.coffee.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coffee.shop.entities.ingredients.Ingredient;
import com.coffee.shop.models.binding.ingredient.IngredientDto;
import com.coffee.shop.models.view.ingedient.IngredientView;
import com.coffee.shop.repositories.IngredientRepository;
import com.coffee.shop.services.IngredientService;
import com.coffee.shop.utils.interfaces.ModelParser;

public class AdditionalIngredientServiceImpl implements IngredientService {

	private final ModelParser modelParser;
	
	private final IngredientRepository ingredientRepo;
	
	@Autowired
	public AdditionalIngredientServiceImpl(ModelParser modelParser, IngredientRepository ingredientRepo) {
		this.modelParser = modelParser;
		this.ingredientRepo = ingredientRepo;
	}
	
	@Override
	public List<IngredientView> getAll() {
		List<Ingredient> ingredients = this.ingredientRepo.findAll();
		List<IngredientView> ingredientViews = this.modelParser.convert(ingredients, IngredientView.class);
	
		return ingredientViews;
	}

	@Override
	public IngredientView getOneById(String id) {
		Ingredient ingredient = this.ingredientRepo.findOneById(id);
		IngredientView ingredientView = this.modelParser.convert(ingredient, IngredientView.class);
		
		return ingredientView;
	}

	@Override
	public IngredientView getOneByName(String name) {
		Ingredient ingredient = this.ingredientRepo.findOneByName(name);
		IngredientView ingredientView = this.modelParser.convert(ingredient, IngredientView.class);
		
		return ingredientView;
	}

	@Override
	public void editAdditionalIngredient(IngredientDto ingredientDto, String id) {
		Ingredient ingredient = this.modelParser.convert(ingredientDto, Ingredient.class);
		ingredient.setId(id);

		this.ingredientRepo.save(ingredient);
	}

	@Override
	public void persist(IngredientDto ingredientDto) {
		Ingredient ingredient = this.modelParser.convert(ingredientDto, Ingredient.class);
		this.ingredientRepo.saveAndFlush(ingredient);
	}

	@Override
	public void removeById(String id) {
		Ingredient ingredient = this.ingredientRepo.findOneById(id);
		this.ingredientRepo.delete(ingredient);
	}
}

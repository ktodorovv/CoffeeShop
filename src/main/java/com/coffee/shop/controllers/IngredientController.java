package com.coffee.shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coffee.shop.entities.enums.IngredientType;
import com.coffee.shop.models.binding.ingredient.IngredientDto;
import com.coffee.shop.models.view.ingedient.IngredientView;
import com.coffee.shop.services.IngredientService;

@Controller
@RequestMapping("/ingredients")
public class IngredientController extends BaseController {

	private final IngredientService ingredientService;
	
	@Autowired
	public IngredientController(IngredientService ingredientService) {
		this.ingredientService = ingredientService;
	}
	
	@GetMapping("/all")
	public ModelAndView getAllIngredients() {
		List<IngredientView> ingredients = this.ingredientService.getAll();
		
		return super.view("/ingredients/all-ingredients", "ingredients", ingredients);
	}
	
	@GetMapping("/add")
	public ModelAndView getAddIngredient() {		
		return super.view("ingredients/add-ingredient", "types", IngredientType.values());
	}
	
	@PostMapping("/add")
	public ModelAndView postAddIngredient(@ModelAttribute IngredientDto ingredientDto) {
		this.ingredientService.persist(ingredientDto);
		
		return super.redirect("/ingredients/add");
	}
}

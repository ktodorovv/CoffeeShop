package com.coffee.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coffee.shop.models.binding.menuitem.ColdDrinkDto;
import com.coffee.shop.services.ColdDrinkService;
import com.coffee.shop.services.FoodService;
import com.coffee.shop.services.HotDrinkService;

@Controller
@RequestMapping("/menu")
public class MenuItemController extends BaseController {
	
	private final ColdDrinkService coldDrinkService;
	
	private final FoodService foodService;
	
	private final HotDrinkService hotDrinkService;
	
	@Autowired
	public MenuItemController(ColdDrinkService coldDrinkService, FoodService foodService, HotDrinkService hotDrinkService) {
		this.coldDrinkService = coldDrinkService;
		this.foodService = foodService;
		this.hotDrinkService = hotDrinkService;
	}
	
	@GetMapping("/add/cold-drink")
	public ModelAndView getAddColdDrink() {
		return super.view("menu/add-cold-drink");
	}
	
	@PostMapping("/add/cold-drink")
	public ModelAndView postAddColdDrink(@ModelAttribute ColdDrinkDto coldDrinkDto) {
		this.coldDrinkService.persist(coldDrinkDto);
		
		return super.redirect("/menu/add/cold-drink");
	}
}
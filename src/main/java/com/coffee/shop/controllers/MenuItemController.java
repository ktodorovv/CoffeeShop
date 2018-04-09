package com.coffee.shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coffee.shop.entities.enums.FoodType;
import com.coffee.shop.models.binding.menuitem.ColdDrinkDto;
import com.coffee.shop.models.binding.menuitem.FoodDto;
import com.coffee.shop.models.view.menuitem.MenuItemListView;
import com.coffee.shop.models.view.menuitem.MenuItemSingleView;
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
		return super.view("menu/cold-drinks/add-cold-drink");
	}
	
	@PostMapping("/add/cold-drink")
	public ModelAndView postAddColdDrink(@ModelAttribute ColdDrinkDto coldDrinkDto) {
		this.coldDrinkService.persist(coldDrinkDto);
		
		return super.redirect("/menu/add/cold-drink");
	}
	
	@GetMapping("/cold-drinks")
	public ModelAndView getAllColdDrinks() {
		List<MenuItemListView> coldDrinks = this.coldDrinkService.getAll();
		
		return super.view("/menu/cold-drinks/all-cold-drinks", "coldDrinks", coldDrinks);
	}
	
	@GetMapping("/all/cold-drinks/{id}")
	public ModelAndView getOneColdDrink(@PathVariable String id) {
		MenuItemSingleView menuItem = this.coldDrinkService.getOnyById(id);
		
		return super.view("menu/individual-menu-item-view", "menuItem", menuItem);
	}
	
	@GetMapping("/edit/cold-drinks/{id}")
	public ModelAndView getEditColdDrink(@PathVariable String id) {
		MenuItemSingleView menuItem = this.coldDrinkService.getOnyById(id);
		
		return super.view("menu/cold-drinks/edit-cold-drink", "menuItem", menuItem);
	}
	
	@PostMapping("/edit/cold-drinks/{id}")
	public ModelAndView postEditColdDrink(@ModelAttribute ColdDrinkDto coldDrinkDto, @PathVariable String id) {
		this.coldDrinkService.edit(coldDrinkDto, id);
		
		return super.redirect("/menu/cold-drinks");
	}
	
	@GetMapping("/food")
	public ModelAndView getAllFoods() {
		List<MenuItemListView> foods = this.foodService.getAll();
		
		return super.view("menu/food/all-foods", "foods", foods);
	}
	
	@GetMapping("add/food")
	public ModelAndView getAddFood() {
		return super.view("menu/food/add-food", "foodTypes", FoodType.values());
	}
	
	@PostMapping("/add/food")
	public ModelAndView postAddFood(@ModelAttribute FoodDto foodDto) {
		this.foodService.persist(foodDto);
		
		return super.redirect("/menu/add/food");
	}
	
	@GetMapping("/edit/food/{id}")
	public ModelAndView getEditFood(@PathVariable String id) {
		MenuItemSingleView food = this.foodService.getOnyById(id);
		
		return super.view("menu/food/edit-food", "food", food);
	}
	
	@PostMapping("/edit/food/{id}")
	public ModelAndView postEditFood(@ModelAttribute FoodDto foodDto, @PathVariable String id) {
		this.foodService.edit(foodDto, id);
		
		return super.redirect("/menu/food");
	}
	
	@GetMapping("/all/food/{id}")
	public ModelAndView getOneFood(@PathVariable String id) {
		MenuItemSingleView food = this.foodService.getOnyById(id);
		
		return super.view("menu/individual-menu-item-view", "menuItem", food);
	}
}
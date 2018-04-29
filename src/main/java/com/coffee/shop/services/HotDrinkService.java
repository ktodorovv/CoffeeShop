package com.coffee.shop.services;

import java.util.List;

import com.coffee.shop.entities.enums.HotDrinkType;
import com.coffee.shop.models.binding.menuitem.HotDrinkDto;
import com.coffee.shop.models.view.menuitem.HotDrinkEditObjectView;
import com.coffee.shop.models.view.menuitem.MenuItemListView;
import com.coffee.shop.models.view.menuitem.MenuItemSingleView;

public interface HotDrinkService {
	List<MenuItemListView> getAll();
	
	List<MenuItemListView> getAllTeas();
	
	List<MenuItemListView> getAllCoffees();
	
	MenuItemSingleView getOneById(String id);
	
	HotDrinkEditObjectView getOneForEditHotDrink(String id);
	
	void edit(HotDrinkDto foodDto, String id);
	
	void persist(HotDrinkDto hotDrinkDto, HotDrinkType type);
	
	// persist custom hot drink
	
	void remove(String id);
	
	HotDrinkType getHotDrinkTypeById(String id);
}
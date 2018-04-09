package com.coffee.shop.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coffee.shop.entities.menuitems.HotDrink;
import com.coffee.shop.models.binding.menuitem.HotDrinkDto;
import com.coffee.shop.models.view.menuitem.MenuItemListView;
import com.coffee.shop.models.view.menuitem.MenuItemSingleView;
import com.coffee.shop.repositories.HotDrinkRepository;
import com.coffee.shop.services.HotDrinkService;
import com.coffee.shop.utils.HotDrinkCalculator;
import com.coffee.shop.utils.interfaces.ModelParser;

@Service
public class HotDrinkServiceImpl implements HotDrinkService {

	private final ModelParser modelParser;
	private final HotDrinkRepository hotDrinkRepo;
	private final HotDrinkCalculator hotDrinkCalc;
	
	public HotDrinkServiceImpl(ModelParser modelParser, HotDrinkRepository hotDrinkRepo, HotDrinkCalculator hotDrinkCalc) {
		this.modelParser = modelParser;
		this.hotDrinkRepo = hotDrinkRepo;
		this.hotDrinkCalc = hotDrinkCalc;
	}
	
	@Override
	public List<MenuItemListView> getAll() {
		List<HotDrink> hotDrinks = this.hotDrinkRepo.findAll();
		List<MenuItemListView> hotDrinkViews = this.convertAllHotDrinks(hotDrinks);
		
		return hotDrinkViews;
	}

	@Override
	public List<MenuItemListView> getAllTeas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuItemListView> getAllCoffees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuItemSingleView getOneById(String id) {
		HotDrink hotDrink = this.hotDrinkRepo.findOneById(id);
		MenuItemSingleView hotDrinkView = this.modelParser.convert(hotDrink, MenuItemSingleView.class);
		hotDrinkView.setCalories(this.hotDrinkCalc.calculateHotDrinkCalories(hotDrink));
		hotDrinkView.setQuantity(this.hotDrinkCalc.calculateHotDrinkQuantity(hotDrink));
		hotDrinkView.setPrice(this.hotDrinkCalc.calculateHotDrinkPrice(hotDrink));
		
		return hotDrinkView;
	}

	@Override
	public void edit(HotDrinkDto hotDrinkDto, String id) {
		HotDrink hotDrink = this.modelParser.convert(hotDrinkDto, HotDrink.class);
		hotDrink.setId(id);
		
		this.hotDrinkRepo.save(hotDrink);
	}

	@Override
	public void persist(HotDrinkDto hotDrinkDto) {
		HotDrink hotDrink = this.modelParser.convert(hotDrinkDto, HotDrink.class);
		
		this.hotDrinkRepo.save(hotDrink);
	}

	@Override
	public void remove(String id) {
		HotDrink hotDrink = this.hotDrinkRepo.findOneById(id);
		
		this.hotDrinkRepo.delete(hotDrink);
	}

	private List<MenuItemListView> convertAllHotDrinks(List<HotDrink> drinks) {
		List<MenuItemListView> hotDrinkViews = new ArrayList<>();
		for (HotDrink hotDrink : drinks) {
			MenuItemListView hotDrinkView = this.modelParser.convert(hotDrink, MenuItemListView.class);
			hotDrinkView.setPrice(this.hotDrinkCalc.calculateHotDrinkPrice(hotDrink));
			hotDrinkViews.add(hotDrinkView);
		}
		
		return hotDrinkViews;
	}
}

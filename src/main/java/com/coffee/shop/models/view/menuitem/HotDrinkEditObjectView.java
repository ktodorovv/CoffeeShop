package com.coffee.shop.models.view.menuitem;

import java.util.List;
import java.util.Map;

import com.coffee.shop.models.view.ingedient.IngredientView;

public class HotDrinkEditObjectView {

	private MenuItemSingleView hotDrink;
	
	private List<IngredientView> allBaseIngredients;
	
	private Map<IngredientView, Boolean> allAdditionalIngredients;

	public MenuItemSingleView getHotDrink() {
		return hotDrink;
	}

	public void setHotDrink(MenuItemSingleView hotDrink) {
		this.hotDrink = hotDrink;
	}

	public Map<IngredientView, Boolean> getAllAdditionalIngredients() {
		return allAdditionalIngredients;
	}

	public void setAllAdditionalIngredients(Map<IngredientView, Boolean> allAdditionalIngredients) {
		this.allAdditionalIngredients = allAdditionalIngredients;
	}

	public List<IngredientView> getAllBaseIngredients() {
		return allBaseIngredients;
	}

	public void setAllBaseIngredients(List<IngredientView> allBaseIngredients) {
		this.allBaseIngredients = allBaseIngredients;
	}
}
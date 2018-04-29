package com.coffee.shop.models.view.menuitem;

import java.util.List;

import com.coffee.shop.models.view.ingedient.IngredientView;

public class HotDrinkEditObjectView {

	private MenuItemSingleView hotDrink;
	
	private List<IngredientView> allBaseIngredients;
	
	private List<IngredientView> allAdditionalIngredients;

	public MenuItemSingleView getHotDrink() {
		return hotDrink;
	}

	public void setHotDrink(MenuItemSingleView hotDrink) {
		this.hotDrink = hotDrink;
	}

	public List<IngredientView> getAllAdditionalIngredients() {
		return allAdditionalIngredients;
	}

	public void setAllAdditionalIngredients(List<IngredientView> allAdditionalIngredients) {
		this.allAdditionalIngredients = allAdditionalIngredients;
	}

	public List<IngredientView> getAllBaseIngredients() {
		return allBaseIngredients;
	}

	public void setAllBaseIngredients(List<IngredientView> allBaseIngredients) {
		this.allBaseIngredients = allBaseIngredients;
	}
}
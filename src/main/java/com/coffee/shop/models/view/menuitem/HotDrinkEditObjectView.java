package com.coffee.shop.models.view.menuitem;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.coffee.shop.models.view.ingedient.IngredientView;

public class HotDrinkEditObjectView {
	
	private List<IngredientView> allBaseIngredients;
	
	private Map<IngredientView, Boolean> allAdditionalIngredients;

	private String name;
	
	private String pictureLink;
	
	private IngredientView baseIngredient;
	
	private Set<IngredientView> additionalIngredients;

	public List<IngredientView> getAllBaseIngredients() {
		return allBaseIngredients;
	}

	public void setAllBaseIngredients(List<IngredientView> allBaseIngredients) {
		this.allBaseIngredients = allBaseIngredients;
	}

	public Map<IngredientView, Boolean> getAllAdditionalIngredients() {
		return allAdditionalIngredients;
	}

	public void setAllAdditionalIngredients(Map<IngredientView, Boolean> allAdditionalIngredients) {
		this.allAdditionalIngredients = allAdditionalIngredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPictureLink() {
		return pictureLink;
	}

	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}

	public IngredientView getBaseIngredient() {
		return baseIngredient;
	}

	public void setBaseIngredient(IngredientView baseIngredient) {
		this.baseIngredient = baseIngredient;
	}

	public Set<IngredientView> getAdditionalIngredients() {
		return additionalIngredients;
	}

	public void setAdditionalIngredients(Set<IngredientView> additionalIngredients) {
		this.additionalIngredients = additionalIngredients;
	}
}
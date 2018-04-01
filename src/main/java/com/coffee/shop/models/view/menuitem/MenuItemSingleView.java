package com.coffee.shop.models.view.menuitem;

import java.util.Set;

import com.coffee.shop.models.view.ingedient.AdditionalIngredientView;
import com.coffee.shop.models.view.ingedient.BaseIngredientView;

public class MenuItemSingleView {

	private String id;
	
	private String name;
	
	private String pictureLink;
	
	private double calories;
	
	private double price;
	
	private double quantity;
	
	private Set<AdditionalIngredientView> additionalIngredients;
	
	private String type;
	
	private BaseIngredientView baseIngredient;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Set<AdditionalIngredientView> getAdditionalIngredients() {
		return additionalIngredients;
	}

	public void setAdditionalIngredients(Set<AdditionalIngredientView> additionalIngredients) {
		this.additionalIngredients = additionalIngredients;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BaseIngredientView getBaseIngredient() {
		return baseIngredient;
	}

	public void setBaseIngredient(BaseIngredientView baseIngredient) {
		this.baseIngredient = baseIngredient;
	}
}

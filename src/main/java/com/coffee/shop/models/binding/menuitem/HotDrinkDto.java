package com.coffee.shop.models.binding.menuitem;

import java.util.Set;

import com.coffee.shop.entities.enums.HotDrinkType;
import com.coffee.shop.models.binding.ingredient.IngredientDto;

public class HotDrinkDto {

	private String name;
	
	private String pictureLink;
	
	private HotDrinkType type;
	
	private IngredientDto baseIngredient;
	
	private Set<IngredientDto> additionalIngredients;

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

	public HotDrinkType getType() {
		return type;
	}

	public void setType(HotDrinkType type) {
		this.type = type;
	}

	public IngredientDto getBaseIngredient() {
		return baseIngredient;
	}

	public void setBaseIngredient(IngredientDto baseIngredient) {
		this.baseIngredient = baseIngredient;
	}

	public Set<IngredientDto> getAdditionalIngredients() {
		return additionalIngredients;
	}

	public void setAdditionalIngredients(Set<IngredientDto> additionalIngredients) {
		this.additionalIngredients = additionalIngredients;
	}
}

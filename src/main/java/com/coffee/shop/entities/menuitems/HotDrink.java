package com.coffee.shop.entities.menuitems;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.coffee.shop.entities.enums.HotDrinkType;
import com.coffee.shop.entities.ingredients.AdditionalIngredient;
import com.coffee.shop.entities.ingredients.BaseIngredient;

@Entity
@Table(name = "hot_drinks")
public class HotDrink extends MenuItem {
	
	@Enumerated(value = EnumType.STRING)
	private HotDrinkType type;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "base_ingredient_id", referencedColumnName = "id")
	private BaseIngredient baseIngredient;
	
	@ManyToMany
	@JoinTable(name = "additional_ingredients_hot_drinks",
	joinColumns = @JoinColumn(name = "hot_drink_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "additional_ingredient_id", referencedColumnName = "id"))
	private Set<AdditionalIngredient> additionalIngredients;
	
	public HotDrink() {
		this.additionalIngredients = new HashSet<>();
	}

	public HotDrinkType getType() {
		return type;
	}

	public void setType(HotDrinkType type) {
		this.type = type;
	}

	public BaseIngredient getBaseIngredient() {
		return baseIngredient;
	}

	public void setBaseIngredient(BaseIngredient baseIngredient) {
		this.baseIngredient = baseIngredient;
	}

	public Set<AdditionalIngredient> getAdditionalIngredients() {
		return additionalIngredients;
	}

	public void setAdditionalIngredients(Set<AdditionalIngredient> additionalIngredients) {
		this.additionalIngredients = additionalIngredients;
	}

	@Override
	public double getPrice() {
		double finalPrice = 0.0;
		finalPrice += this.baseIngredient.getPrice();
		
		for (AdditionalIngredient ingredient : this.additionalIngredients) {
			finalPrice += ingredient.getPrice();
		}
		
		return finalPrice;
	}

	@Override
	public double getQuantity() {
		double finalQuantity = 0.0;
		finalQuantity += this.baseIngredient.getQuantity();
		
		for (AdditionalIngredient ingredient: this.additionalIngredients) {
			finalQuantity += ingredient.getQuantity();
		}
		
		return finalQuantity;
	}

	@Override
	public double getCalories() {
		double finalCalories = 0.0;
		finalCalories += this.baseIngredient.getCalories();
		
		for (AdditionalIngredient ingredient: this.additionalIngredients) {
			finalCalories += ingredient.getCalories();
		}
		
		return finalCalories;
	}
}

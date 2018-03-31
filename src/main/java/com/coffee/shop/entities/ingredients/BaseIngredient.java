package com.coffee.shop.entities.ingredients;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.coffee.shop.constants.EntityConstants;
import com.coffee.shop.entities.enums.IngredientPortion;

@Entity
@Table(name = "basic_ingredients")
public class BaseIngredient extends Ingredient {
	
	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false)
	private IngredientPortion portion;
	
	@Override
	public double getCalories() {
		return this.calculateAccordingToPortion(super.getCalories());
	}
	
	@Override
	public double getPrice() {
		return this.calculateAccordingToPortion(super.getPrice());
	}

	@Override
	public double getQuantity() {
		return this.calculateAccordingToPortion(super.getQuantity());
	}

	public IngredientPortion getPortion() {
		return portion;
	}

	public void setPortion(IngredientPortion portion) {
		this.portion = portion;
	}
	
	private double calculateAccordingToPortion(double referenceNumberToCalculate) {
		switch (this.getPortion()) {
		case SMALL:
			return referenceNumberToCalculate * EntityConstants.SMALL_INGREDIENT_PORTION_MULTIPLIER;
		case MEDIUM:
			return referenceNumberToCalculate * EntityConstants.MEDIUM_INGREDIENT_PORTION_MULTIPLIER;
		case LARGE:
			return referenceNumberToCalculate * EntityConstants.LARGE_INGREDIENT_PORTION_MULTIPLIER;
		default:
			return 0.0;
		}
	}
}
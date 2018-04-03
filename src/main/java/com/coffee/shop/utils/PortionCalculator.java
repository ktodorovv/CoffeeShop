package com.coffee.shop.utils;

import com.coffee.shop.constants.EntityConstants;
import com.coffee.shop.entities.enums.IngredientPortion;

public class PortionCalculator {
	public static double calculateAccordingToPortion(double referenceNumberToCalculate, IngredientPortion portion) {
		switch (portion) {
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

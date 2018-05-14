package com.coffee.shop.models.binding.menuitem;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.coffee.shop.constants.ErrorMessages;

public class ColdDrinkDto {
	
	@NotNull(message = ErrorMessages.BLANK_FIELD_ERROR)
	@NotBlank(message = ErrorMessages.BLANK_FIELD_ERROR)
	@Max(value = 40)
	private String name;
	
	private String pictureLink;
	
	@NotNull(message = ErrorMessages.BLANK_FIELD_ERROR)
	@DecimalMin(value = "0.0", message = ErrorMessages.NO_NUMBER_MESSAGE)
	private double price;
	
	@NotNull(message = ErrorMessages.BLANK_FIELD_ERROR)
	@DecimalMin(value = "0.0", message = ErrorMessages.NO_NUMBER_MESSAGE)
	private double quantity;
	
	@NotNull(message = ErrorMessages.BLANK_FIELD_ERROR)
	@DecimalMin(value = "0.0", message = ErrorMessages.NO_NUMBER_MESSAGE)
	private double calories;

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

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
}

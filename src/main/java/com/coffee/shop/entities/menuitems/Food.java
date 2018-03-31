package com.coffee.shop.entities.menuitems;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.coffee.shop.entities.enums.FoodType;

@Entity
@Table(name = "foods")
public class Food extends MenuItem {

	@Column(nullable = false)
	private FoodType foodType;

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
}

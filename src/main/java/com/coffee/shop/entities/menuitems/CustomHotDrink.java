package com.coffee.shop.entities.menuitems;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "custom_hot_drinks")
public class CustomHotDrink extends HotDrink {

	private Date dateCreated;

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	// TODO: add creator(User class)
}
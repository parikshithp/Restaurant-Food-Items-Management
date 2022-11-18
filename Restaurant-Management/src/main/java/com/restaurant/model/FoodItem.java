package com.restaurant.model;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name="foodmenu")
public class FoodItem {
    
	@Id
	private Integer itemNumber;
	private String itemName;
	private String cuisine;
	private String price;
	private String availability;

	public Integer getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName( String itemName) {
		this.itemName = itemName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailabality(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "FoodItem [itemNumber=" + itemNumber + ", itemName=" + itemName + ", cuisine=" + cuisine + ", price="
				+ price + ", availability=" + availability + "]";
	}
    
	
}

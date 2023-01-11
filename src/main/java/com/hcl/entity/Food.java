package com.hcl.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Food {
	
	@Id
	private String foodId;
	private String foodName;
	private String price;
	private String category;
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String foodId, String foodName, String price, String category) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.price = price;
		this.category = category;
	}
	
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}

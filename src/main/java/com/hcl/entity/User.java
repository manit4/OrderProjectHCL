package com.hcl.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	@Id
	private String username;
	private String password;
	private String name;
	private String phone;
	
	@ManyToMany
	private List<Food> foodItems;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String name, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	public User(String username, String password, String name, String phone, List<Food> foodItems) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.foodItems = foodItems;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Food> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<Food> foodItems) {
		this.foodItems = foodItems;
	}
}

package com.hcl.entity;

import java.io.Serializable;

public class RelationshipId implements Serializable{
	
	private String orderId;
	private String foodId;
	public RelationshipId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RelationshipId(String orderId, String foodId) {
		super();
		this.orderId = orderId;
		this.foodId = foodId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

}

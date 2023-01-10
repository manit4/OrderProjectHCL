package com.hcl.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "order_food")
@IdClass(RelationshipId.class)
public class Order implements Serializable{
	
	@Id
	private String orderId;
	private String userId;
	@Id
	private String foodId;
	private String quantity;
	private Date date;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderId, String userId, String foodId, String quantity, Date date) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.foodId = foodId;
		this.quantity = quantity;
		this.date = date;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}

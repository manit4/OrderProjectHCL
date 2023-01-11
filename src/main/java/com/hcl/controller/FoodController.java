package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Food;
import com.hcl.service.FoodService;

@RestController
@RequestMapping("/foodCrud")
@CrossOrigin
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@PostMapping("/addFood")
	public String addFood(@RequestBody Food food) {
		
		System.out.println(food.getFoodId()+", "+food.getFoodName()+", "+food.getPrice()+", "+food.getCategory());
		
		String foodStatus = foodService.addFood(food);
		
		return foodStatus;
	}
	
	@DeleteMapping("/delete/{foodId}")
	public String delete(@PathVariable String foodId) {
		
		System.out.println("inside delete() "+foodId);
		
		String foodStatus = foodService.deleteFoodItem(foodId);
		
		return foodStatus;
		
		
	}

}

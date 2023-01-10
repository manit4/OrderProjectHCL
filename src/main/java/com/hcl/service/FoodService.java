package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Food;
import com.hcl.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	FoodRepository foodRepository;
	
	public String addFood(Food food) {
		
		foodRepository.save(food);
		
		return "Food added Successfully";
	}

}

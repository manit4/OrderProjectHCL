package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Food;

@Repository
public interface FoodRepository extends CrudRepository<Food, String>{
	
	
	

}

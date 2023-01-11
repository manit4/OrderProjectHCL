package com.hcl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hcl.entity.Order;
import com.hcl.service.FoodService;
import com.hcl.service.OrderService;
import com.hcl.service.UserService;

@SpringBootApplication
@CrossOrigin
public class RestSwagger2Application implements CommandLineRunner {

	@Autowired
	UserService userService;

	@Autowired
	FoodService foodService;
	
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(RestSwagger2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		User user1 = new User("s_001", "1234", "Suhail Ali", "787878");
//
//		userService.saveUser(user1);

//		User user2 = new User("in_001", "2345", "Indukuri Indu", "989898");
//
//		userService.saveUser(user2);

//		Food food = new Food("f_100", "Noodles", "90", "Veg");
//		
//		foodService.addFood(food);

//		Food food = new Food("f_101", "Ham-Burger", "100", "Veg");
//
//		foodService.addFood(food);
		
//		Food food1 = new Food("f_100", "Noodles", "90", "Veg");
//		Food food2 = new Food("f_101", "Ham-Burger", "100", "Veg");
//		
//		List<Food> foodItems = new ArrayList<Food>();
//		foodItems.add(food1);    foodItems.add(food2);
//		
//		User user1 = new User("s_001", "1234", "Suhail Ali", "787878");
//		user1.setFoodItems(foodItems);
//		
//		userService.saveUser(user1);
		
//		Date date = new Date();
//		System.out.println(date);
//		
//		String userId = "s_001";
//		
//		double randomNumber = Math.random();
//		System.out.println(randomNumber);
//		
//		String stringRandom = randomNumber+"";
//		
//		String orderId = "o_"+stringRandom.substring(3, 9);
//		
//		System.out.println(orderId);
//		
//		Order order1 = new Order(orderId, userId, "f_101", "2", date);
//		Order order2 = new Order(orderId, userId, "f_100", "1", date);
//		
//		orderService.save(order1);
//		orderService.save(order2);
		
		
		

	}

}

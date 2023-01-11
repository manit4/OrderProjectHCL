package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Order;
import com.hcl.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/placeOrder")
	public String placeOrder(@RequestBody List<Order> order) {
		
		for(Order orderr : order) {
			
			orderService.save(orderr);
		}
		
		return "Your Order has been placed";
	}
	

}

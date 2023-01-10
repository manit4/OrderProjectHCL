package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.User;
import com.hcl.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
//	@PostMapping("/register")
//	public String register(String username, String password, String name, int phone) {
//		
//		System.out.println(username+", "+password+", "+name+", "+phone);
//		
//		return "Thanks for registering with us...";
//	}
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		
		System.out.println(user.getUsername()+", "+user.getPassword()+", "+user.getName()+", "+user.getPhone());
		
		userRepository.save(user);
		
		return "Thanks for registering with us...";
	}
	
//	@PostMapping("/register")
//	public String register(@RequestBody List<User> users) {
//		
//		
//		for(User user : users) {
//			
//			System.out.println(user.getUsername()+", "+user.getPassword()+", "+user.getName()+", "+user.getPhone());
//		}
//		
//		return "Thanks for registering with us...";
//	}

}

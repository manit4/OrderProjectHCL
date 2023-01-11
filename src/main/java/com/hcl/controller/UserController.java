package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.User;
import com.hcl.repository.UserRepository;
import com.hcl.service.UserService;
import com.hcl.to.LoginTO;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
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
		
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		
		System.out.println("Before setting encodedPassword to user object"+user.getPassword());
		
		user.setPassword(encodedPassword);
		
		System.out.println("After setting encodedPassword to user object "+user.getPassword());
		
		userService.saveUser(user);
		
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
	
//	@PostMapping("/login")
//	public User login(@RequestBody LoginTO  loginTo) {
//		
//		User user = userService.validate(loginTo.getUsername());
//		
//		if(user !=  null) {
//			
//			if(user.getPassword().equals(loginTo.getPassword())) {
//				
//				return user;
//			}	
//		}
//		return null;
//	}
	
	@GetMapping("/testing")
	public String test() {
		
		return "hello";
	}
	
	

}

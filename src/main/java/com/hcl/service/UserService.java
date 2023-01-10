package com.hcl.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.User;
import com.hcl.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public void saveUser(User user) {
		
		repository.save(user);
	}
	
	public User validate(String username) {
		
		User user = null;
		
		Optional<User> optional = repository.findById(username);
		
		if(optional.isPresent()) {
			
			user = optional.get();
		}
		
		return user;
	}
	
	public String delete(String id) {
		
		repository.deleteById(id);;
		
		return "Deleted Successfully";
	}
	
	public String update(User user) {
		
		repository.save(user);
		
		return "Updated Successfully";
	}

}

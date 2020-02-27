package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService service;
	
	
	public UserController(UserService service) {
		super();
		this.service = service;
	}
	@PostMapping("/users")
	public User create(@RequestBody User user) {
		
		return service.createUser(user);
		
		
	}
	@GetMapping("/getusers")
	public List<User> getAll()
	{
		return service.getAllUsers();
	}
	
	
}

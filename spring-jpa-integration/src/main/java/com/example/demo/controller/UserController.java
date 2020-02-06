package com.example.demo.controller;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.shared.SharedUser;
@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserService service;
	@Autowired
	public UserController(UserService service) {
		super();
		this.service = service;
	}
	@PostMapping("/users")
	public SharedUser create(@RequestBody User user)
	{
		user.setuId(UUID.randomUUID().toString());
		user.setCraetionDate(LocalDate.now());
		user.setIsAdmin(false);
		return service.createUser(user);
		
	}
	@GetMapping("/users/{id}")
	public SharedUser find(@PathVariable Integer id) 
	{
		
		return service.findUserById(id);
		
	}
	
	
}

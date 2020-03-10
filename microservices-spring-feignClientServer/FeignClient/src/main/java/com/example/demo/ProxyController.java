package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProxyController {

	@Autowired
	private UserClient client;
	
	@RequestMapping("/users")
	public List<Users> getAllGroups(){
		return client.getAllUsers();
	}
}
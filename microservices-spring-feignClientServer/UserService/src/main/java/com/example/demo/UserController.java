package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> getAllUsers(){
		List<Users> users=new ArrayList<>();
		users.add(new Users(1,"user 1"));
		users.add(new Users(2,"user 2"));
		users.add(new Users(3,"user 3"));
		return users;
		
	}
	

}

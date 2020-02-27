package com.example.demo.model;

import java.util.List;

public interface UserService {
	public User createUser(User user);
	public List<User> getAllUsers();
}

package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService{
	@Autowired
	private UserrDao dao;
	
	@Override
	@Transactional
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}

package com.example.demo.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.shared.SharedUser;
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
	private UserDao dao;
	private ModelMapper mapper;
	{
		mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}
	
	@Override
	@Transactional
	public SharedUser createUser(User user) {
		User tempUser=dao.save(user);
		return mapper.map(tempUser,SharedUser.class);
	}

	@Override
	@Transactional
	public SharedUser findUserById(Integer id) {
		
	
		return mapper.map(dao.findById(id),SharedUser.class);
	}

}

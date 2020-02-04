package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ToDoDao;

import com.example.demo.model.ToDo;
@Service
public class ToDoServiceImpl implements ToDoService {

	private ToDoDao dao;
	

	@Autowired
	public ToDoServiceImpl(ToDoDao dao) {
		super();
		this.dao = dao;
	}



	@Override
	public List<ToDo> getAllToDos() {
		
		return dao.getAllToDos();
	}

}

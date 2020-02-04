package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.ToDo;
@Repository
public class ToDoDaoImpl implements ToDoDao {

	List<ToDo> list=null;
	{
		list=new ArrayList<ToDo>();
		list.add(new ToDo(1, "Brushing"));
		list.add(new ToDo(2, "Bathing"));
		list.add(new ToDo(3, "Swimming"));
		list.add(new ToDo(4, "Cycling"));
		list.add(new ToDo(5, "Running"));
		list.add(new ToDo(6, "Gyming"));
		
	}
	
	@Override
	public List<ToDo> getAllToDos() {
		
		return list;
	}

}

package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
@Transactional
public interface BookDao extends JpaRepository<Book, Integer>{

	public List<Book> findByName(String name);
	public List<Book> findByAuthor(String author);
	public List<Book> findByNameAndAuthor(String name,String Author);
}

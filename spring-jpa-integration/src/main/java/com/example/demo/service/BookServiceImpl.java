package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;
@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService {
public BookDao dao;
	@Autowired
	public BookServiceImpl(BookDao dao) {
	super();
	this.dao = dao;
}

	@Override
	@Transactional
	public List<Book> getAllBooks() {
		
		return dao.findAll();
	}

	@Override
	@Transactional
	public Optional<Book> getBookById(Integer bookId) {
		
		return dao.findById(bookId);
	}

}

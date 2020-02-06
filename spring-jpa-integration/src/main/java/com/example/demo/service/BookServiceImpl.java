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

	@Override
	
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return dao.save(book);
	}

	@Override
	public void deleteById(Integer bookId) {
		// TODO Auto-generated method stub
		 dao.deleteById(bookId);;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		 dao.deleteAll();;
	}

	@Override
	public List<Book> findByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name) ;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.findByAuthor(author);
	}

	@Override
	public List<Book> findByNameAndAuthor(String name, String Author) {
		// TODO Auto-generated method stub
		return dao.findByNameAndAuthor(name, Author);
	}

}

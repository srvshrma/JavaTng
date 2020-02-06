package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(Integer bookId);
	public Book createBook(Book book);
	public void deleteById(Integer bookId);
	public void deleteAll();
	public List<Book> findByName(String name);
	public List<Book> findByAuthor(String author);
	public List<Book> findByNameAndAuthor(String name,String Author);
}

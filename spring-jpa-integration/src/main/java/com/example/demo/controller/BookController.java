package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	private BookService service;

	public BookController(BookService service) {
		super();
		this.service = service;
	}
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return service.getAllBooks();
		
	}
	@GetMapping("/books/{bookId}")
	public Optional<Book> getBookById(@PathVariable Integer bookId){
		
		return service.getBookById(bookId);
	}
	
}

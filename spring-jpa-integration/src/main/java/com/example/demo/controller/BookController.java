package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.BookNotFoundException;
import com.example.demo.error.ErrorMessage;
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
	public List<Book> getAllBooks() {
		return service.getAllBooks();

	}

	@GetMapping("/books/{bookId}")
	public Optional<Book> getBookById(@PathVariable Integer bookId) {
		Optional<Book> book = service.getBookById(bookId);
		if (!book.isPresent()) {
			throw new BookNotFoundException("book not found with id: " + bookId);
		}

		return book;

	}

	@ExceptionHandler
	public ResponseEntity<ErrorMessage> error1(BookNotFoundException bnf) {
		ErrorMessage em = new ErrorMessage();
		em.setMessage(bnf.getMessage());
		em.setStatus(HttpStatus.NOT_FOUND.value());
		em.setErrorTime(System.currentTimeMillis());

		return new ResponseEntity<ErrorMessage>(em, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorMessage> error2(BookNotFoundException bnf) {
		ErrorMessage em = new ErrorMessage();
		em.setMessage(bnf.getMessage());
		em.setStatus(HttpStatus.BAD_REQUEST.value());
		em.setErrorTime(System.currentTimeMillis());

		return new ResponseEntity<ErrorMessage>(em, HttpStatus.BAD_REQUEST);

	}
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		book.setBookId(0);
		return service.createBook(book);
		
		
	}
}

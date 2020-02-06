package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ItemService;
import com.example.demo.model.Item;

@RestController
@RequestMapping("/api")
public class ItemController {
	
	private ItemService service;
	@Autowired
	public ItemController(ItemService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/items")
	public List<Item> getAllItem(){
		return service.getAllItem();
		
		
	}
	
	@GetMapping("/items/{itemId}")
	public Optional<Item> getBookById(@PathVariable String itemId) {
		Optional<Item> item = service.getItemById(itemId);

		return item;

	}
	
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item) {
		item.setItemId(0);
		return service.createItem(item);
	}
	@PutMapping("/items")
	public Item updateItem(@RequestBody Item item) {
		
		return service.createItem(item);
	}
	@DeleteMapping("/items/{itemId}")
	public void deleteById(@PathVariable String itemId)
	{
		service.deleteById(itemId);
	

	}
	
	@DeleteMapping("/items")
	public void deleteAll()
	{
		service.deleteAll();
	}

	@GetMapping("/items/findByName/{name}")
	public List<Item> findByName(@PathVariable String name) {
		return service.findByName(name);

	}
	@GetMapping("/items/findByPrice/{price}") 
	public List<Item> findByAuthor(@PathVariable String price) {
		return service.findByPrice(price);

	}
	@GetMapping("/items/findByNameAndPrice/{name}/{price}")
	public List<Item> findByNameAndAuthor(@PathVariable String name,@PathVariable String price) {
		return service.findByNameAndPrice(name,price);
}
}

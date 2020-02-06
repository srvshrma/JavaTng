package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Item;


public interface ItemService {
	
	
	public List<Item> getAllItem();
	public Optional<Item> getItemById(String itemId);
	public Item createItem(Item item);
	public void deleteById(String itemId);
	public void deleteAll();
	public List<Item> findByName(String name);
	public List<Item> findByPrice(String price);
	public List<Item> findByNameAndPrice(String name,String price);
	

}

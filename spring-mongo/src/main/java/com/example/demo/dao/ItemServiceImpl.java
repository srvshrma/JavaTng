package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;
@Service

public class ItemServiceImpl implements ItemService {
	@Autowired
	public ItemRepository repo;
	



	@Override
	@Transactional
	public List<Item> getAllItem() {
		
		return repo.findAll();
	}


	@Override
	@Transactional
	public Optional<Item> getItemById(String itemId) {
		
		return repo.findById(itemId);
	}

	
	@Override
	public Item createItem(Item item) {
		
		return repo.save(item);
	}


	@Override
	public void deleteById(String itemId) {
		repo.deleteById(itemId);
		
	}


	@Override
	public void deleteAll() {
		repo.deleteAll();
		
	}


	@Override
	public List<Item> findByName(String name) {
		
		return repo.findByName(name);
	}


	@Override
	public List<Item> findByPrice(String price) {
		// TODO Auto-generated method stub
		return repo.findByPrice(price);
	}


	@Override
	public List<Item> findByNameAndPrice(String name, String price) {
		// TODO Auto-generated method stub
		return repo.findByNameAndPrice(name, price);
	}

}

package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Item;

@Repository

public interface ItemRepository extends MongoRepository<Item, String> {

	public List<Item> findByName(String name);
	public List<Item> findByPrice(String price);
	public List<Item> findByNameAndPrice(String name,String price);
}

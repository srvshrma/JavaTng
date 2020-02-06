package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;

@SpringBootApplication
public class SpringMongoApplication implements CommandLineRunner{
	//private ItemRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}
	//@Autowired
	//public SpringMongoApplication(ItemRepository repo) {
//		super();
	//	this.repo = repo;
//	}

	@Override
	public void run(String... args) throws Exception {
		 
	//	repo.save(new Item("Computer","2000"));
	//	repo.save(new Item("Mobile","3000"));
	}

}

package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Document             //used for mongo declaration
@Data

public class Item {

	
	@Id
	private String itemId;
	private String name;
	private String price;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private LocalDate dateOfCreation;
	private Product product;
	public void setItemId(int i) {
		// TODO Auto-generated method stub
		
	}
	
}

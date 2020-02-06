package com.example.demo.model;

import lombok.Data;


public class Product {
	
	private String category;
	private String brand;
	public Product(String category, String brand) {
		super();
		this.category = category;
		this.brand = brand;
	}
	public Product() {
		super();
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}

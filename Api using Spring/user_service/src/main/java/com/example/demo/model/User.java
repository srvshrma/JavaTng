package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private String userId;
	@Column( name = "username")
	private String userName;
	@Column(name="email")
	private String email;

}

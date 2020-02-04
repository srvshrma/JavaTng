package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String name;
	private String author;
	
}

package com.example;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
		
	public static void main(String args[]) {
		Student student=new Student(12, "Saurav", "Saurav@Sharma");
		try {
			
			ObjectMapper mapper=new ObjectMapper();
			String json=mapper.writeValueAsString(student);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

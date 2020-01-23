package com.mycompany.jdbcmaven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerApp {

	private static CustomerService service;
	static
	{
		service = new CustomerServiceImpl();
	}

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		do {
			System.out.println("1. Create customer");
			System.out.println("2. Display all customers");
			System.out.println("3. Find customer by id");
			System.out.println("4. Update customer");
			System.out.println("5. Delete customer");
			System.out.println("0. Exit");
			System.out.println("Choice:  ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.println(" First Name: ");
				String fName = br.readLine().toString();
				System.out.println(" Last Name: ");
				String lName = br.readLine().toString();
				System.out.println(" Email: ");
				String email = br.readLine().toString();
				Customer customer = service.createCustomer(fName, lName, email);
				System.out.println("Create customer success " + customer);
				break;
			case 2:
				
			 System.out.println();;
				
			case 0:
				System.exit(0);

			default:
				System.out.println("Invalid!!!!!!!!!");
				break;
			}

		} while (choice != 0);

	}

}

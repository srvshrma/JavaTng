package com.mycompany.jdbcmaven;

import java.sql.SQLException;

public interface CustomerService {
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException;
}

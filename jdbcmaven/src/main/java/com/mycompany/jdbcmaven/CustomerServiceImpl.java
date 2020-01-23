package com.mycompany.jdbcmaven;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
	{
		dao = new CustomerDaoImpl();
	}

	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {

		return dao.createCustomer(firstName, lastName, email);
	}

}

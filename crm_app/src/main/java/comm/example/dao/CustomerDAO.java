package comm.example.dao;

import java.util.List;

import comm.example.model.Customer;

public interface CustomerDAO {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}

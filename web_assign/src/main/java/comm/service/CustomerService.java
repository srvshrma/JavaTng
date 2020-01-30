package comm.service;

import java.util.List;

import comm.model.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public void update(Customer customer);
	public Customer findById(int id);
	public void delete(Customer customer);
}

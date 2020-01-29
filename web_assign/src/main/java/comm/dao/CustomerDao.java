package comm.dao;

import java.util.List;

import comm.model.Customer;

public interface CustomerDao {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public void update(Customer customer);
	public Customer findById(int id);
	public void delete(Customer customer);
}

package jdbcTemplate;

import java.util.List;

public interface CustomerDAO {
	public Customer createCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
}

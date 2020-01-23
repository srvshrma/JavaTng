package annotationjdbc;

import java.util.List;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
		
		public List<Customer> getAllCustomers();
	

}

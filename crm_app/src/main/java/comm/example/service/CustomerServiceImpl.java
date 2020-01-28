package comm.example.service;

import java.util.List;

import comm.example.dao.CustomerDAO;
import comm.example.dao.CustomerDaoImpl;
import comm.example.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDAO dao=null;
	{
		dao= new CustomerDaoImpl();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}
	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

}

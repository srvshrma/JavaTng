package comm.service;

import java.util.List;

import comm.dao.CustomerDao;
import comm.dao.CustomerDaoImpl;
import comm.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	CustomerDao dao=null;
	{
		dao= new CustomerDaoImpl();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}
	@Override
	public List<Customer> getAllCustomers() {
		
		return dao.getAllCustomers();
		
	}
	@Override
	public void update(Customer customer) {
		dao.update(customer);
		
	}
	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		
		return dao.findById(id);
	}
	@Override
	public void delete(Customer customer) {
		
		dao.delete(customer);
		
	}
	
	

}

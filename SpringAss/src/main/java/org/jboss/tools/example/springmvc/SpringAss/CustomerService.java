package org.jboss.tools.example.springmvc.SpringAss;

import java.util.List;

public class CustomerService {
	
	CustomerDAO custDao;
	public Customer createCustomer(String custId,String custName,String address)
	{
		return custDao.createCustomer(custId, custName, address);
	}
	public List<Customer> displayCustomer()
	{
			return custDao.displayCustomer();
	}
	public Customer findById(String id)
	{
		
		return custDao.findById(id);	
	} 
}

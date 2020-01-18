package org.jboss.tools.example.springmvc.SpringAss;

import java.util.List;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class CustomerDAO {

	List<Customer> list = null;
	Customer cust;
	public Customer createCustomer(String custId,String custName,String address)
	{
		
		cust.setCustId(custId);
		cust.setCustName(custName);
		cust.setAddress(address);
		list.add(cust);
		
		return cust;	
	}
	public List<Customer> displayCustomer()
	{
		return list;	
	}
	public Customer findById(String id)
	{
		for(Customer c : list)
		{
			if(c.getCustId().equals(id))
			{
				cust.setCustName(c.getCustName());
				
				cust.setAddress(c.getAddress());
				cust.setCustId(c.getCustId());
			}
		}
		return cust;	
	
	
}}

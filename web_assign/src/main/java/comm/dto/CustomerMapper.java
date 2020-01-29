package comm.dto;

import comm.model.Customer;
import comm.model.CustomerDto;

public class CustomerMapper implements CustomerDtoImpl{
	

	@Override
	public Customer customerDtoToCustomer(CustomerDto dto) {
		Customer customer= new Customer();
		
		customer.setName(dto.getName());
		customer.setEmail(dto.getEmail());
		return customer;
	}

	@Override
	public CustomerDto customerToCustomerDto(Customer customer) {
		CustomerDto cDto= new CustomerDto();
		
		cDto.setName(customer.getName());
		cDto.setEmail(customer.getEmail());
		return cDto;
		
	}
	

}

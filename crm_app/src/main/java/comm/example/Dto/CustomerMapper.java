package comm.example.Dto;

import comm.example.model.Customer;
import comm.example.model.CustomerDto;

public class CustomerMapper implements CustomerDtoImpl {

	
	@Override
	public Customer customerDtoToCustomer(CustomerDto dto) {
		Customer customer=new Customer();
		customer.setUId(dto.getUId());
		customer.setName(dto.getName());
		customer.setEmail(dto.getEmail());
		
		return customer;
	}

	@Override
	public CustomerDto customerToCustomerDto(Customer customer) {
		CustomerDto cDto=new CustomerDto();
		cDto.setUId(customer.getUId());
		cDto.setName(customer.getName());
		cDto.setEmail(customer.getEmail());
		return cDto;
	}

}

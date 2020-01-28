package comm.example.Dto;

import org.mapstruct.Mapper;

import comm.example.model.Customer;
import comm.example.model.CustomerDto;

@Mapper
public interface CustomerDtoImpl {
	
	public Customer customerDtoToCustomer(CustomerDto dto);
	public CustomerDto customerToCustomerDto(Customer customer);

}

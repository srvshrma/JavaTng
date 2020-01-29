package comm.dto;

import comm.model.Customer;
import comm.model.CustomerDto;

public interface CustomerDtoImpl {
	
	public Customer customerDtoToCustomer(CustomerDto dto);
	public CustomerDto customerToCustomerDto(Customer customer);

}

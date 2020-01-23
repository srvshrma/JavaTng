package annotationjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO cDao;
	@Autowired
	public void setcDao(CustomerDAO cDao) {
		this.cDao = cDao;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return cDao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return cDao.getAllCustomers();
	}

}

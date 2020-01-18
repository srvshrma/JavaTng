package springjdbc;

import java.sql.SQLException;

public interface CustomerDAO {
	
	public Customer createCustomer(Customer customer) throws SQLException;

}

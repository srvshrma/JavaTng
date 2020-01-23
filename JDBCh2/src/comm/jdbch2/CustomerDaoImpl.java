package comm.jdbch2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
	private MyConnection myConnection = null;
	private Connection connection = null;
	private Customer customer = null;
	PreparedStatement pStatement = null;
	{
		myConnection = MyConnection.getMyConnectionObject();
		try {
			connection = myConnection.getMyConnection();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		// TODO Auto-generated method stub
		customer=new Customer(firstName,lastName,email);
		pStatement = connection.prepareStatement("insert into customer(first_name,last_name,email) values(?,?,?)");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		
		pStatement.setString(3, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}

}

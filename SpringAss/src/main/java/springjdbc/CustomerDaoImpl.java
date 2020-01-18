package springjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dao")
public class CustomerDaoImpl implements CustomerDAO {
	private DataSource datasource;
	private PreparedStatement pStatement;
	private Connection connection;
	private static Logger logger= Logger.getLogger("springjdbc.CustomerDaoImpl");
	
	
	
	@Autowired
	public CustomerDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
		
	}

	@PostConstruct
	public void init()
	{
		try {
			logger.info("creating connection");
			connection=datasource.getConnection();
			logger.info("connection established.");
		} catch (SQLException e) {
			
			e.printStackTrace();
			logger.info("connection unsuccesfull.");
		}
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		pStatement=connection.prepareStatement("insert into customer(custId,custName,email) values(?,?,?)");
		pStatement.setString(1, customer.getCustId());
		pStatement.setString(2, customer.getCustName());
		pStatement.setString(3, customer.getEmail());
		pStatement.executeBatch();
		
		return customer;
	}

}

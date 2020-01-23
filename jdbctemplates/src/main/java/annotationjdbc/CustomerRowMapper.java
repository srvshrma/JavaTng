package annotationjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper{
	

	@Override
	public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
		Customer customer=new Customer();
		customer.setUId(rs.getString("uid"));
		customer.setF_name(rs.getString("f_name"));
		customer.setL_name(rs.getString("l_name"));
		customer.setEmail(rs.getString("email"));
		return customer;
		
	}

}

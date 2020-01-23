package annotationjdbc;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("cDao")
public class CustomerDaoImpl implements CustomerDAO {
	private JdbcTemplate jt=null;
	
@Autowired
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public Customer createCustomer(Customer customer){
	
		String sql="insert into customer(uid,f_name,l_name,email) values(?,?,?,?)";
		jt.update(sql, new Object[] {customer.getUId(),customer.getF_name(),customer.getL_name(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers(){
		String query="select uid,f_name,l_name,email from customer";
		return jt.query(query,new CustomerRowMapper()); 
	}

}

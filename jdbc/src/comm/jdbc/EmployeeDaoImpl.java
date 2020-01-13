package comm.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private MyConnection mc=null;
	private Connection c=null;
	private Statement s=null;
	List<Employee> ls=null;
	
	{
		mc=MyConnection.getMyConnectionObject();
		try {
			c=mc.getMyConnection();
			ls=new ArrayList<Employee>();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		s=c.createStatement();
		ResultSet rs=s.executeQuery("select employee_id,first_name,last_name,salary from employees");
		while(rs.next()) {
			ls.add(new Employee(rs.getInt("employee_id"),
					rs.getString("first_name"),
					rs.getString("last_name"),
					rs.getDouble("salary")));
		}
		return ls;
	}
	


}

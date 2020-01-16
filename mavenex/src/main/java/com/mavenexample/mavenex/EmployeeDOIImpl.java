package com.mavenexample.mavenex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeDOIImpl implements EmployeeDOI{
	
	private MyConnection myconnection=null;
	private Connection connection=null;
	private Employee employee=null;
	PreparedStatement pStatement=null;
	
	{
		myconnection=MyConnection.getMyConnectionObject();
		try {
			connection=myconnection.getMyConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		//employee=new Employee(UUID.randomUUID().toString(),employee.getEmpName(),employee.getEmail());
		pStatement=connection.prepareStatement("insert into "
				+ "employee(uid,empName,email) "
				+ "values(?,?,?)");
		pStatement.setString(1, employee.getUId());
		pStatement.setString(2, employee.getEmpName());
		
		pStatement.setString(3, employee.getEmail());
		pStatement.executeUpdate();
		return employee;
	}
	@Override
	public List<Employee> findById(String uId,String empName) throws SQLException {
		pStatement=connection.prepareStatement("select uid,empName,email from employee where uid=? AND empName=?");
		pStatement.setString(1,uId);
		pStatement.setString(2, empName);
		ResultSet rs=pStatement.executeQuery();
		List<Employee> ls=new ArrayList<Employee>();
		while(rs.next()) {
			Employee employee=new Employee(rs.getString("uid"),rs.getString("empName"),rs.getString("email"));
			ls.add(employee);
		}
		
		return ls;
	}
	@Override
	public Employee updateEmployee(Employee employee,String uId) throws SQLException {
		// TODO Auto-generated method stub
		pStatement=connection.prepareStatement("update employee set empName=? ,email=? where uid=?");
		
		pStatement.setString(1, employee.getEmpName());
		
		pStatement.setString(2, employee.getEmail());
		pStatement.setString(3, employee.getUId());
		pStatement.executeUpdate();
		return employee;
	}
	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		pStatement=connection.prepareStatement("select uid,empName,email from employee");
		
		ResultSet rs=pStatement.executeQuery();
		List<Employee> ls=new ArrayList<Employee>();
		while(rs.next()) {
			Employee employee=new Employee(rs.getString("uid"),rs.getString("empName"),rs.getString("email"));
			ls.add(employee);
		}
		return ls;
	}
	@Override
	public Employee deleteEmployee(Employee employee, String uId) throws SQLException {
pStatement=connection.prepareStatement("delete from employee where uid=?");
		
pStatement.setString(1, uId);
		pStatement.executeUpdate();
		return employee;
		
	}
	@Override
	public List<Employee> findByuId(String uId) throws SQLException {
		pStatement=connection.prepareStatement("select uid,empName,email from employee where uid=?");
		pStatement.setString(1,uId);
		
		ResultSet rs=pStatement.executeQuery();
		List<Employee> ls=new ArrayList<Employee>();
		while(rs.next()) {
			Employee employee=new Employee(rs.getString("uid"),rs.getString("empName"),rs.getString("email"));
			ls.add(employee);
		}
		return ls;
	}
	

	
	

}

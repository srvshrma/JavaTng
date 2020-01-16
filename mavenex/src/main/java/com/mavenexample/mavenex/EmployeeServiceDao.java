package com.mavenexample.mavenex;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceDao implements EmployeeService{

	EmployeeDOI empdoi=null;
	{
		empdoi=new EmployeeDOIImpl();
	}
	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		
		return empdoi.createEmployee(employee);
	}
	@Override
	public List<Employee> findById(String uId,String empName) throws SQLException {
		
		return empdoi.findById(uId,empName);
	}
	@Override
	public Employee updateEmployee(Employee employee,String uId) throws SQLException {
		// TODO Auto-generated method stub
		return empdoi.updateEmployee(employee,uId);
	}
	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		
		return empdoi.getAllEmployees();
	}
	@Override
	public Employee deleteEmployee(Employee employee, String uId) throws SQLException {
		// TODO Auto-generated method stub
		return empdoi.deleteEmployee(employee, uId);
	}
	@Override
	public List<Employee> findByuId(String uId) throws SQLException {
		
		return empdoi.findByuId(uId);
	}
	
	
}

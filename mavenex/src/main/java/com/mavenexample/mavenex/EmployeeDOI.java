package com.mavenexample.mavenex;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDOI {
	
	public Employee createEmployee(Employee employee) throws SQLException;
	public List<Employee> findById(String uId,String empName) throws SQLException;
	public List<Employee> findByuId(String uId) throws SQLException;
	public Employee updateEmployee(Employee employee, String uId) throws SQLException;
	public List<Employee> getAllEmployees() throws SQLException;
	public Employee deleteEmployee(Employee employee,String uId)throws SQLException;
}

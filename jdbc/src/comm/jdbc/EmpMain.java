package comm.jdbc;

import java.sql.SQLException;

import java.util.List;

public class EmpMain {
private EmployeeService service;
	public static void main(String[] args) throws SQLException {
		EmpMain em=new EmpMain();
		em.service=new EmployeeServiceImpl();
		List<Employee> ls=em.service.getAllEmployees();
		System.out.println("  ID     FIRST_NAME     LAST_NAME      SALARY");
		ls.forEach(e->{
			System.out.println(e.getEmployeeId()+"      "+e.getFirstName()+"        "+e.getLastName()+"          "+e.getSalary());
		});
	}

}

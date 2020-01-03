package comm.test;
import comm.example.Employee;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=Employee.createEmployee(100, "Saurav", 25000);
		System.out.println(employee.displayEmployeeDetails());

	}

}

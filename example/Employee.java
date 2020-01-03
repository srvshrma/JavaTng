package comm.example;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;

	public Employee(int employeeId, String employeeName, double salary) // Parameterized Constructor
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;

	}

	public static Employee createEmployee(int employeeId, String employeeName, double salary) // Create new employee
	{

		return new Employee(employeeId, employeeName, salary);
	}

	public String displayEmployeeDetails() {
		return "Employee ID:" + employeeId + "  Employee Name:" + employeeName + "  Salary:" + salary;
	}

}

package comm.employeeexception;

import java.util.UUID;

public class Employee {

	private String empId;
	private String empName;
	private int age;
	private double exp;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private Employee employee;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee(String empId, String empName, int age, double exp, String address)
			throws EmployeeNotElligibleException {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.exp = exp;
		this.address = address;

	}

	public Employee createEmployee(String empName, int age, double exp,String address)throws EmployeeNotElligibleException {
		boolean isEqual=false;
		employee=new Employee(UUID.randomUUID().toString(),empName,age,exp,address);
		if(employee.getExp()<2) {
			throw new EmployeeNotElligibleException("Employee can't be hired. Experience needed above 2 years. ");
			
		}
		
		else if((this.getEmpName()==employee.getEmpName())&&(this.getAddress()==employee.getAddress())) {
			isEqual=true;
			throw new EmployeeNotElligibleException("Employee can't be hired. Sorry!!");
			
		}
		
		return employee;
		
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "EmpId=" + empId + ", empName=" + empName + ", age=" + age + ", exp=" + exp + ", employee=" + employee;
	}

}

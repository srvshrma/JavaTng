package comm.employeeexception;

public class EmpExcTest {

	public static void main(String[] args) throws EmployeeNotElligibleException{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.createEmployee("Saurav", 22, 2,"Gurgaon");
		e2.createEmployee("Saurav", 27, 5, "Gurgaon");
		System.out.println(e1.equals(e2));
		

	}

}

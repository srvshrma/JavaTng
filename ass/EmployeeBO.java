package comm.ass;

import java.util.List;

public class EmployeeBO {
   static void printEmployees(List<Employee> emp) {
	   System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n","Employee ID","Name","department", "dateOfJoining","Age","Salary");
    for (Employee e:emp) 
    	System.out.println(e);
    
}
}
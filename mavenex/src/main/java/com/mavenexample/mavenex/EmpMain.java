package com.mavenexample.mavenex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class EmpMain {

	
		private static EmployeeService service;
		static {
			service = new EmployeeServiceDao();
		}

		public static void main(String args[]) throws NumberFormatException, IOException, SQLException
		{
			int choice = 0;
			String empName,email,uId;
			Employee employee=null;
			List<Employee> ls=null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("1. create employee");
				System.out.println("2. display all employees");
				System.out.println("3. find employee by id");
				System.out.println("4. update employee");
				System.out.println("5. delete employee");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				switch (choice) {
				case 1:
					System.out.print(" Employee Name: ");
					empName=br.readLine().toString();
					
					System.out.print(" Email: ");
					email=br.readLine().toString();
					String arr[]=UUID.randomUUID().toString().split("-");
					Employee theEmp=new Employee((arr[0]+arr[1]),empName, email);
					employee=service.createEmployee(theEmp);
					System.out.println("Create Employee Success "+employee);
			
					break;
				case 2:
					
			
					ls=service.getAllEmployee();
					System.out.format("%-20s%-20s%-20s\n","ID",
							"EMP_NAME","EMAIL");
					ls.forEach(c->{
						System.out.format("%-20s%-20s%-20s\n",c.getUId()
								,c.getEmpName(),c.getEmail());
					});
					break;
					
				case 3:
					System.out.println("UID : ");
					uId=br.readLine().toString();
					System.out.println("Emp Name : ");
					empName=br.readLine().toString();
					List<Employee> lst=service.findById(uId,empName);
					if(lst.isEmpty()) {
						
						System.out.println("No Employee found.");
					}
					else {
						Employee e=lst.get(0);
						System.out.println("Employee found "+e);
					}
					break;
				case 4: 
					System.out.println("UID:  ");
					uId=br.readLine().toString();
					
					ls =service.findByuId(uId);
					if(ls.isEmpty()) {
						
						System.out.println("No Employee found.");
					}
					else {
						Employee e=ls.get(0);
						System.out.println("Employee found "+e);
						System.out.print(" Employee Name: ");
						empName=br.readLine().toString();
						System.out.print(" Email: ");
						email=br.readLine().toString();
						e.setEmail(email);
						e.setEmpName(empName);
						e.setUId(uId);
						employee=service.updateEmployee(e,e.getUId());
						System.out.println("Update Employee Success "+employee);
						
					}
				case 5:
				
					System.out.println("UID:  ");
					uId=br.readLine().toString();
					
					
					ls =service.findByuId(uId);
					if(ls.isEmpty()) {
						
						System.out.println("No Employee found.");
					}
					else {
						Employee e=ls.get(0);
						System.out.println("Employee found "+e);
					
						
						employee=service.deleteEmployee(e,e.getUId());
						System.out.println("Delete Employee Success "+employee);
					}
				
				case 0:
					System.exit(0);
					
				default:
					System.out.println("invalid choice");
					break;
				}

			} while (choice != 0);

		}
}



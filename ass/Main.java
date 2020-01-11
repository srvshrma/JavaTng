package comm.ass;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Main {

	public static void main(String[] args)throws IOException,ParseException, java.text.ParseException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input the number of employees: ");
		int n=Integer.parseInt(br.readLine());
		List<Employee> emp=new ArrayList<Employee>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details for employee "+(i+1));
			String name=br.readLine();
			String department=br.readLine();
			Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			int age=Integer.parseInt(br.readLine());
			int salary=Integer.parseInt(br.readLine());
			Employee e=new Employee(name, department, dateOfJoining, age, salary);
			emp.add(e);
		}
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of joining");
		System.out.println("Enter your choice");
		int choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1:
			Collections.sort(emp);
			EmployeeBO.printEmployees(emp);
			break;
		case 2:
			Collections.sort(emp,new AgeComparator());
			EmployeeBO.printEmployees(emp);
	}
	}
	}

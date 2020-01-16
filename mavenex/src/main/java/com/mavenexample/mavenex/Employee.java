package com.mavenexample.mavenex;

import java.io.Serializable;
import lombok.*;
@Getter
@Setter
public class Employee implements Serializable {

	private static final long serialVersionUID = -398072866034990121L;

	private int empId;
	private String empName;
	private String email;
	private String uId;
	public Employee(String uId,String empName, String email) {
		super();
		this.uId=uId;
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", email=" + email + ", uId=" + uId + "]";
	}

	
	
	
	
}

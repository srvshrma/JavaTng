package EmpAdd;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Employee {

	private String empId;
	private String empName;
	private Address address;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	
	
}

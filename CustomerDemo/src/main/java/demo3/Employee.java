package demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Employee {
	@Value("${employee.id}")
	private String empId;
	@Value("${employee.name}")
	private String empName;
	@Autowired
	private Address address;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	
	
}

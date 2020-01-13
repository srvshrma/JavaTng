package comm.jdbc;

import java.io.Serializable;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Employee implements Serializable{
	
	private static final long serialVersionUID = -2674205274725041952L;
	private  int employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	
	
}

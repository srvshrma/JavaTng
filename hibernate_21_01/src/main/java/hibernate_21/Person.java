package hibernate_21;

import java.sql.Date;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor@NoArgsConstructor@Getter
@Setter@ToString

public class Person {
	
	private String id;
	private String name;
	private LocalDate dob;
	

}

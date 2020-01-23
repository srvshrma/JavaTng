package hibernatePerson;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String uId;
	@Column(name="name")
	private String cName;
	@Column(name="dob")
	private LocalDate dob;
	public Person(String uId, String cName, LocalDate dob) {
		super();
		
		this.uId = uId;
		this.cName = cName;
		this.dob = dob;
	}
	

}

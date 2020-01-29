package comm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor@Getter@Setter
public class CustomerDto {

	private int id;
	
	private String name;
	private String email;
	public CustomerDto(String name, String email) {
		super();
	
		this.name = name;
		this.email = email;
		
}
}
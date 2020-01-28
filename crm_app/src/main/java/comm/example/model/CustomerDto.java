package comm.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class CustomerDto {

	private int id;
	private String uId;
	private String name;
	private String email;
	public CustomerDto(String uId, String name, String email) {
		super();
		this.uId = uId;
		this.name = name;
		this.email = email;
	}
	

}

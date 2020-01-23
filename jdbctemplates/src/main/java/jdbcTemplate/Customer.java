package jdbcTemplate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor@Getter@Setter@Component@AllArgsConstructor

public class Customer {
	
	private String uId;
	private String f_name;
	private String l_name;
	private String email;
	@Override
	public String toString() {
		return "Customer [uId=" + uId + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + "]";
	}
	public Customer( String f_name, String l_name, String email) {
		super();
		
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
	}
	
	

}

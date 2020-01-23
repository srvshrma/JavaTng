package comm.jdbch2;

import java.io.Serializable;
import lombok.*;

@Getter
@ToString
public class Customer implements Serializable {

	private static final long serialVersionUID = -5582799005681750105L;

	private int customerId;
	private String firstName;
	private String lastName;
	private String email;

	public Customer(String firstName, String lastName, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	
}

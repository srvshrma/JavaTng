package springjdbc;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Component
public class Customer {

	private String custId;
	private String custName;
	private String email;

	public Customer(String custId, String custName, String email) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + "]";
	}

}
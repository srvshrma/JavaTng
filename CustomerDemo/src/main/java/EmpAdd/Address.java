package EmpAdd;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class Address {

		private String addressLine1;
		private String addressLine2;
		private String phoneNo;
		private String zipCode;
		@Override
		public String toString() {
			return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", phoneNo=" + phoneNo
					+ ", zipCode=" + zipCode + "]";
		}
		
		
}

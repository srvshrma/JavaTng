package comm.example.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	@NotNull
	@Size(min = 5, max = 20, message = "first name required...")
	private String firstName;
	@NotNull
	@Size(min = 5, max = 20, message = "last name required...")
	private String lastName;
	@Email(message = "provide email")
	private String email;
	@NotNull
	@Range(min = 15, max = 55, message = "Enter age between range 15 to 55...")
	private int age;
	private String country;
	@Pattern(regexp = "([0-9]{6}|[0-9]{3}\\s[0-9]{3})", message = "Enter correct code...")
	private String postalCode;
	private LinkedHashMap<String, String> countryOptions;
	private String favLanguage;
	private String[] operatingSystems;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States");
		countryOptions.put("GE", "Germany");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
	}

}

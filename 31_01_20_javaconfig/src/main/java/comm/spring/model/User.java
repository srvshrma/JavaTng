package comm.spring.model;

public class User {

	private String email;
	private String password;
	private String country;
	public User() {
		super();
	}
	public User(String email, String password,String country) {
		super();
		this.email = email;
		this.password = password;
		this.country=country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}

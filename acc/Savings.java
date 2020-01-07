package comm.acc;

public class Savings extends Account {
	
	private float rateOfInterest;
	private String account;
	
	public Savings() {
		super();
		
	}

	public Savings(Integer accountId, String name, String address) {
		super(accountId, name, address);
		
	}

	@Override
	public String toString() {
		return "Savings [rateOfInterest=" + rateOfInterest + ", account=" + account + "]";
	}
	
	

}

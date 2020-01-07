package comm.acc;

public class Account {
	private Integer accountId;
	private String name;
	private String address;
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", address=" + address + "]";
	}
	public Account() {
		super();
	}
	public Account(Integer accountId, String name, String address) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.address = address;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Account acc=null;
		boolean isEqual=false;
		if(obj instanceof Account) {
			acc=(Account) obj;
		}
		if((this.accountId.Savings()==this.accountId.Current())) {
			isEqual=true;
		}
		
		return isEqual;
	}
	 
	
}

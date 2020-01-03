package comm.accu;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Account {

	private String accountNo;
	private AccountType accountType;
	private double amount;
	private LocalDate dateOfOpening;
	private static Account account;
	static {
		account = new Account();
	}

	public static Account createAccount(AccountType accountType, double amount) {
		account.setAccountNo(UUID.randomUUID().toString());
		account.setAccountType(accountType);
		account.setAmount(amount);
		account.setDateOfOpening(LocalDate.now());
		return account;
	}

	public String displayAccount() {
		return "Account Number: " + getAccountNo() + " Account Type: " + getAccountType() + " Amount: " + getAmount()
				+ " Opening Date: " + getDateOfOpening();
	}

}

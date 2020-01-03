package comm.accu;
import java.util.*;
import comm.accu.Account;
import comm.accu.AccountType;
public class AccountTester {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int choice=1;
		Account account=null;
		do {
			System.out.println("1.Create Account");
			System.out.println("2.Display Account ");
			System.out.println("0. Exit");
			System.out.println("Choose your choice>>>>:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				account=Account.createAccount(AccountType.CREDITCARD,15000);
				break;
			case 2:
				System.out.println(account.displayAccount());
				break;
			case 0:
				System.out.println("Exiting from the system...!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice...");
				break;
			}
		}while(choice!=0);
	}
}
		
		
		
		
		

package AbstractPrograms;
import java.util.Scanner;
public class SavingsAccount extends BankAccount {

	int dp,wd,balance; 
	@Override
	void deposit() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Deposit Ammount : ");
		dp = sc.nextInt();
		System.out.println("Amount Of Rs."+dp+" is Deposited Successfully ");
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Ammount to Withdraw: ");
		wd = sc.nextInt();
		System.out.println("Amount Of Rs."+wd+" has been debited / Withdrawn Successfully ");
		balance = dp-wd;
		System.out.println("Your Current Balance is : Rs."+balance);
	}

}

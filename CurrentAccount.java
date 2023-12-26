package InterfacePrograms;
import java.util.Scanner;
public class CurrentAccount implements Accounts{
	double deposits,withdraws,interest,balance;
	Scanner sc = new Scanner(System.in);
	public void deposit() {
		
		System.out.print("Enter the Amount to be Deposited to Current Account : ");
		deposits = sc.nextDouble();
		System.out.println("Amount of RS."+deposits+" Deposited Successfully ");
		
	}

	public void withdraw() {
		System.out.print("Enter the Amount to be Withdrawn from Current Account : ");
		withdraws = sc.nextDouble();
		System.out.println("Amount of RS."+withdraws+" Debited Successfully ");
		
	}

	public void calculateInterest() {
		
		interest = balance*0.09;
	System.out.println("Interest Amount is RS."+interest+" Deposited Successfully ");
	}

	public void viewBalance() {
		balance = (deposits + interest) - withdraws;
		System.out.println("Total Balance in the Current Account is RS."+balance+" Balance Fetched Successfully ");		
		
	}

}

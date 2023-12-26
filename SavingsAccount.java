package InterfacePrograms;
import java.util.Scanner;
public class SavingsAccount implements Accounts{
double deposits,withdraws,interest,balance;
Scanner sc = new Scanner(System.in);
@Override
	public void deposit() {
		System.out.print("Enter the Amount to be Deposited to Savings Account : ");
		deposits = sc.nextDouble();
		System.out.println("Amount of RS."+deposits+" Deposited Successfully ");
}

	@Override
	public void withdraw() {
		System.out.print("Enter the Amount to be Withdrawn from Savings Account : ");
		withdraws = sc.nextDouble();
		System.out.println("Amount of RS."+withdraws+" Debited Successfully ");
	}

	@Override
	public void calculateInterest() {
		interest = balance*0.02;
	System.out.println("Interest Amount is RS."+interest+" Deposited Successfully ");
		
	}

	@Override
	public void viewBalance() {
		
		balance = (deposits + interest) - withdraws;
		System.out.println("Total Balance in the SavingsAccount is RS."+balance+" Balance Fetched Successfully ");		
	}

}

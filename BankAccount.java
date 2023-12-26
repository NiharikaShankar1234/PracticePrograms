package InterfacePrograms;

public class BankAccount {
	public static void main (String []args) {
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		sa.deposit();
		sa.withdraw();
		sa.viewBalance();
		sa.calculateInterest();
		ca.deposit();
		ca.withdraw();
		ca.viewBalance();
		ca.calculateInterest();
	}
}

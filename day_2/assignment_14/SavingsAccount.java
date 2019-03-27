package assignment_14;

public class SavingsAccount extends Account{

	private double minimumBalance = 500;
	private double interestRate = 12;
	
	public SavingsAccount() {
		System.out.println("Savings Account class default constructor");
	}
	
	public SavingsAccount(int accountNo, Customer customer, double balance ) {
		super(accountNo, customer, balance);
		System.out.println("Savings Account class Parameterized constructor");
	}
	
	public void withdraw(double amount) {
		if(amount <= (balance-500)) {
				this.balance = balance - amount;
		}
		else {
			System.out.println("No sufficient balance");
		}
	}
	
	public double calculateInterest() {
		interestRate = (interestRate * balance)/100;
		return interestRate;
	}
	
	
}

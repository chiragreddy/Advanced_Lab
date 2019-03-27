package assignment_16;

public class SavingsAccount3 extends Account3{

	private double minimumBalance = 500;
	private double interestRate = 12;
	
	public SavingsAccount3() {
		System.out.println("Savings Account class default constructor");
	}
	
	public SavingsAccount3(int accountNo, Customer3 customer, double balance ) {
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

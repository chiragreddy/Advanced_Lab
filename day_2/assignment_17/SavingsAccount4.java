package assignment_17;

public class SavingsAccount4 extends Account4{

	private double minimumBalance = 500;
	private double interestRate = 12;
	
	public SavingsAccount4() {
		System.out.println("Savings Account class default constructor");
	}
	
	public SavingsAccount4(int accountNo, Customer4 customer, double balance ) {
		super(accountNo, customer, balance);
		System.out.println("Savings Account class Parameterized constructor");
	}
	
	//Method Overridden 
	
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

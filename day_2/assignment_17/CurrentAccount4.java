package assignment_17;

public class CurrentAccount4 extends Account4{
	private double currentAmount;
	
	public CurrentAccount4() {
		System.out.println("Current Account class default constructor");
	}
	
	public CurrentAccount4(int accountNo, Customer4 customer, double balance, double currentAmount) {
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount; 
		System.out.println("Current Account class Parameterized constructor");
	}
	
	// Method Overridden 
	 
	public void withdraw(double amount) {
	
		if(amount <= (balance + 10000)) {
			this.balance = (balance) - amount;
		}
		else {
			this.balance = balance + currentAmount;
			System.out.println("No sufficient balance");
		}
	}
	
	public double getEligibilityAmount() {
		if(balance > 0) {
			return balance + 10000;
		}
		else {
			return 10000 - balance;
		}
	}
	
	
}

package assignment_15;

public class CurrentAccount2 extends Account2{
	private double currentAmount;
	
	public CurrentAccount2() {
		System.out.println("Current Account class default constructor");
	}
	
	public CurrentAccount2(int accountNo, Customer2 customer, double balance, double currentAmount) {
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount; 
		System.out.println("Current Account class Parameterized constructor");
	}
	
	public void withdraw(double amount) {
	
		if(amount <= (balance + 10000)) {
			this.balance = balance - amount;
		}
		else {
			System.out.println("No sufficcient balance");
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

package assignment_16;

public class CurrentAccount3 extends Account3{
	private double currentAmount;
	
	public CurrentAccount3() {
		System.out.println("Current Account class default constructor");
	}
	
	public CurrentAccount3(int accountNo, Customer3 customer, double balance, double currentAmount) {
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount; 
		System.out.println("Current Account class Parameterized constructor");
	}
	
	public void withdraw(double amount) {
	
		if(amount <= (balance + 10000)) {
			this.balance = (balance) - amount;
			System.out.println("The balance is: " + balance);
		}
		else {
			System.out.println("No sufficient balance");
		}
	}
	
	public double getEligibilityAmount(){
		if(balance > 0) {
			return balance + 10000;
		}
		else {
			return 10000 - balance;
		}
	}
	
}

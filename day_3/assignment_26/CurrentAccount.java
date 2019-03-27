package assignment_26;

public class CurrentAccount extends Account{
	private double currentAmount;
	
	public CurrentAccount() {
		System.out.println("Current Account class default constructor");
	}
	
	public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount; 
		System.out.println("Current Account class Parameterized constructor");
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
	
		if(amount <= (balance + 10000)) {
			this.balance = (balance) - amount;
		}
		else {
			throw new InsufficientBalanceException();
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
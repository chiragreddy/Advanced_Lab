package assignment_26;

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
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if((balance - 500) <= amount) {
			throw new InsufficientBalanceException();
		}
		else {
			this.balance = balance - amount;
		}
	}
	
	public double calculateInterest() {
		interestRate = (interestRate * balance)/100;
		return interestRate;
	}
	
	
}
package assignment_16;

public abstract class Account3{

	private int accountNo;
	private Customer3 customer;
	protected double balance;
	
	public Account3() {
		System.out.println("Account class default constructor");
	}
	
	public Account3(int accountNo, Customer3 customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("Account class Parameterized constructor");
	}	
	
	public Customer3 getCustomer() {
		return this.customer;
	}
	
	public double balanceEnquiry() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public abstract void withdraw(double amount);
	
}

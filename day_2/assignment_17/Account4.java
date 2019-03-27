package assignment_17;

public class Account4 {

	private int accountNo;
	private Customer4 customer;
	protected double balance;
	
	public Account4() {
		System.out.println("Account class default constructor");
	}
	
	public Account4(int accountNo, Customer4 customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("Account class Parameterized constructor");
	}	
	
	public Customer4 getCustomer() {
		return this.customer;
	}
	
	public double balanceEnquiry() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("Account class withdraw method");
	}
}

package assignment_15;

public class Account2 {

	private int accountNo;
	private Customer2 customer;
	protected double balance;
	
	public Account2() {
		System.out.println("Account class default constructor");
	}
	
	public Account2(int accountNo, Customer2 customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("Account class Parameterized constructor");
	}	
	
	public Customer2 getCustomer() {
		return this.customer;
	}
	
	public double balanceEnquiry() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
}

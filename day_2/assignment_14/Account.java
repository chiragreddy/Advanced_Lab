package assignment_14;

public class Account {

	private int accountNo;
	private Customer customer;
	protected double balance;
	
	public Account() {
		System.out.println("Account class default constructor");
	}
	
	public Account(int accountNo, Customer customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("Account class Parameterized constructor");
	}	
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public double balanceEnquiry() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
}

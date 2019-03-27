package com.Wellsbank.account;

import com.Wellsbank.customer.Customer6;

public class CurrentAccount6 extends Account6{
	private double currentAmount;
	
	public CurrentAccount6() {
		System.out.println("Current Account class default constructor");
	}
	
	public CurrentAccount6(int accountNo, Customer6 customer, double balance, double currentAmount) {
		super(accountNo, customer, balance);
		this.currentAmount = currentAmount; 
		System.out.println("Current Account class Parameterized constructor");
	}
	
	public void withdraw(double amount) {
	
		if(amount <= (balance + 10000)) {
			this.balance = (balance) - amount;
		}
		else {
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
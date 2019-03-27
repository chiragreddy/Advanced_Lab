package com.Wellsbank.account;

import com.Wellsbank.customer.Customer6;

public class SavingsAccount6 extends Account6{

	private double minimumBalance = 500;
	private double interestRate = 12;
	
	public SavingsAccount6() {
		System.out.println("Savings Account class default constructor");
	}
	
	public SavingsAccount6(int accountNo, Customer6 customer, double balance ) {
		super(accountNo, customer, balance);
		System.out.println("Savings Account class Parameterized constructor");
	}
	
	public void withdraw(double amount) {
		if(amount <= (balance-500)) {
				this.balance = balance - amount;
		}
		else {
			System.out.println("No sufficient balance");
		}
	}
	
	public double calculateInterest() {
		interestRate = (interestRate * balance)/100;
		return interestRate;
	}
	
	
}

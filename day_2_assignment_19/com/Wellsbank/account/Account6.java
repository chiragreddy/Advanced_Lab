package com.Wellsbank.account;

import com.Wellsbank.customer.Customer6;

public class Account6 {

	private int accountNo;
	private Customer6 customer;
	protected double balance;
	
	public Account6() {
		System.out.println("Account class default constructor");
	}
	
	public Account6(int accountNo, Customer6 customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("Account class Parameterized constructor");
	}	
	
	public Customer6 getCustomer() {
		return this.customer;
	}
	
	public double balanceEnquiry() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
}
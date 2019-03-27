package com.Wellsbank;

import com.Wellsbank.customer.Customer6;
import com.Wellsbank.account.*;

public class Wellsbank6 {

	public static void main(String[] args) {
		Customer6 john = new Customer6(100, "John","Irving, Texas",75063); 
		SavingsAccount6 johnSA = new SavingsAccount6(101, john, 1000);
		johnSA.deposit(1000);
		 System.out.println(johnSA.balanceEnquiry());
		johnSA.withdraw(1500);
		 System.out.println(johnSA.balanceEnquiry());
		Customer6 jenny = new Customer6(200,"jenny","Wichita, Kansas",67220);
		CurrentAccount6 jennyCA = new CurrentAccount6(201,jenny,500,2000);
		jennyCA.deposit(1500);
		 System.out.println(jennyCA.getEligibilityAmount());
		jennyCA.withdraw(1000);
		System.out.println(jennyCA.getEligibilityAmount());
		jennyCA.withdraw(4000);
		System.out.println(jennyCA.getEligibilityAmount());
		jennyCA.withdraw(3000);
		System.out.println(jennyCA.getEligibilityAmount());
	}
	
}
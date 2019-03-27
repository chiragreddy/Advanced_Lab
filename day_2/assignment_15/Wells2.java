package assignment_15;

public class Wells2 {

	public static void main(String[] args) {
		Customer2 john = new Customer2(100, "John","Irving, Texas",75063); 
		Account2 johnSA = new SavingsAccount2(101, john, 1000); // account class type referencing savings account object
		transaction(johnSA,1000.0);
		johnSA.deposit(1000);
		System.out.println(johnSA.balanceEnquiry());
//		johnSA.withdraw(1500);
//		System.out.println(johnSA.balanceEnquiry());
		Customer2 jenny = new Customer2(200,"jenny","Wichita, Kansas",67220);
		Account2 jennyCA = new CurrentAccount2(201,jenny,500,2000); // account class type referencing current account object
		transaction(jennyCA,1500.0);
		jennyCA.deposit(1500);
		System.out.println(jennyCA.balanceEnquiry());
//		jennyCA.withdraw(1000);
//		System.out.println(jennyCA.getEligibilityAmount());
//		jennyCA.withdraw(4000);
//		System.out.println(jennyCA.getEligibilityAmount());
//		jennyCA.withdraw(3000);
//		System.out.println(jennyCA.getEligibilityAmount());
		
	}
	
	public static void transaction(Account2 account, double amount) {
		account.deposit(amount);
	  //account.withdraw(100);                 -  no withdraw method in account class
	}
	
}

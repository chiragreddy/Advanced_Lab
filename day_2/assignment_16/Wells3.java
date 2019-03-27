package assignment_16;

public class Wells3 {

	public static void main(String[] args) {
		Customer3 john = new Customer3(100, "John","Irving, Texas",75063); 
	
		Account3 johnSA = new SavingsAccount3(101, john, 1000);
		
		transaction(johnSA, 1000);
		johnSA.withdraw(1600);
		System.out.println(johnSA.balanceEnquiry());
		
		Customer3 jenny = new Customer3(200,"jenny","Wichita, Kansas",67220);
		
		Account3 jennyCA = new CurrentAccount3(201,jenny,500,2000);
		
		transaction(johnSA, 1500);
		
		 System.out.println(jennyCA.balanceEnquiry());
		jennyCA.withdraw(1000);
		System.out.println(jennyCA.balanceEnquiry());
		jennyCA.withdraw(4000);
		System.out.println(jennyCA.balanceEnquiry());
		jennyCA.withdraw(3000);
		System.out.println(jennyCA.balanceEnquiry());
	}
	
	public static void transaction(Account3 account, double amount) {
		account.deposit(amount);
	}
	
}

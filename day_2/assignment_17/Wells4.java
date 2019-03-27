package assignment_17;

public class Wells4 {

	public static void main(String[] args) {
		Customer4 john = new Customer4(100, "John","Irving, Texas",75063); 
		Account4 johnSA = new SavingsAccount4(101, john, 1000); // dynamic binding
		
		transaction(johnSA,1000);
		System.out.println(johnSA.balanceEnquiry());
		 
		Customer4 jenny = new Customer4(200,"jenny","Wichita, Kansas",67220);
		Account4 jennyCA = new CurrentAccount4(201,jenny,500,2000);   // dynamic binding
		
		transaction(jennyCA,1500);
		System.out.println(jennyCA.balanceEnquiry());
	
	}
	
	public static void transaction(Account4 account, double amount) {
		account.deposit(amount);
		account.withdraw(100);
	}
	
}
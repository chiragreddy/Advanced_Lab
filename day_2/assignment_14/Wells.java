package assignment_14;

public class Wells {

	public static void main(String[] args) {
		Customer john = new Customer(100, "John","Irving, Texas",75063); 
		SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
		johnSA.deposit(1000);
		 System.out.println(johnSA.balanceEnquiry());
		johnSA.withdraw(1500);
		 System.out.println(johnSA.balanceEnquiry());
		Customer jenny = new Customer(200,"jenny","Wichita, Kansas",67220);
		CurrentAccount jennyCA = new CurrentAccount(201,jenny,500,2000);
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

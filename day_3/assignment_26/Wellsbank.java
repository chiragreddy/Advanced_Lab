package assignment_26;

public class Wellsbank {

	public static void main(String[] args) {
		 Customer john = new Customer(100, "John","Irving, Texas",75063); 
		 SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
		 johnSA.deposit(1000);
		 System.out.println(johnSA.balanceEnquiry());
		try {
		    johnSA.withdraw(1500);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(johnSA.balanceEnquiry());
		Customer jenny = new Customer(200,"jenny","Wichita, Kansas",67220);
		CurrentAccount jennyCA = new CurrentAccount(201,jenny,500,2000);
		jennyCA.deposit(1500);
		 System.out.println(jennyCA.getEligibilityAmount());
		try {
		jennyCA.withdraw(1000);
		}
	    catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(jennyCA.getEligibilityAmount());
		try {
		jennyCA.withdraw(4000);
		}
		catch(InsufficientBalanceException e) {
		    System.out.println(e.getMessage());
		}
		System.out.println(jennyCA.getEligibilityAmount());
		try {
		jennyCA.withdraw(3000);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(jennyCA.getEligibilityAmount());
	}
	
}
package assignment_12c;

public class TestLoan {

	public static void main(String[] args) {
		
		Loan3 loan1 = Loan3.getLoanInstance(); // Calling static method using className.MethodName
		Loan3 loan2 = Loan3.getLoanInstance();
		Loan3 loan3 = Loan3.getLoanInstance();
		
		// The method getNumberOfObjects() need not be static as the Loan object can be returned using the getLoanInstance() static method
		
		System.out.println("Number of instances: " + Loan3.getLoanInstance().getNumberOfObjects()); 
		
	}
	
}

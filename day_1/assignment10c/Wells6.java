package assignment10c;

public class Wells6 {

public static void main(String[] args) {
	
		// Invoking parameterized constructor without invoking default constructor
	
		EmployeeGrade6 james = new EmployeeGrade6(102,"James",4.2f,4.4f,4.1f);
		james.calculateAverageFeedback();
		james.calculateGrade();
		james.displayInfo();
		
	}
	
}
package assignment10b;

public class Wells5 {

public static void main(String[] args) {
	
		EmployeeGrade5 ram = new EmployeeGrade5();
		ram.calculateAverageFeedback();
		ram.calculateGrade();
		ram.displayInfo();
		
		System.out.println("\nSecond Employee: \n");
		
		EmployeeGrade5 james = new EmployeeGrade5(102,"James",4.2f,4.4f,4.1f);
		james.calculateAverageFeedback();
		james.calculateGrade();
		james.displayInfo();
		
	}
	
}
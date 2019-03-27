package assignment10d;

public class Wells7 {

public static void main(String[] args) {
	
	// throws a compiler error as there is only a parameterized constructor and no default constructor is provided by the system
		EmployeeGrade7 ram = new EmployeeGrade7(); 
		EmployeeGrade7 james = new EmployeeGrade7(102,"James",4.2f,4.4f,4.1f);
		james.calculateAverageFeedback();
		james.calculateGrade();
		james.displayInfo();
		
	}
	
}
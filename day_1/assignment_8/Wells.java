package assignment_8;

public class Wells {

public static void main(String[] args) {
		
		EmployeeGrade2 Elvis = new EmployeeGrade2();
		Elvis.initializeEmployee(1, "Elvis",85.6f,73.8f,65.8f); // // feedback on a scale of 1 to 100
		Elvis.calculateAverageFeedback();
		Elvis.calculateGrade();
		Elvis.displayInfo();
		
	}
	
}
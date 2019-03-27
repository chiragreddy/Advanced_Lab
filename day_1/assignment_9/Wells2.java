package assignment_9;

public class Wells2 {

public static void main(String[] args) {
		
		EmployeeGrade3 Elvis = new EmployeeGrade3();
		Elvis.initializeEmployee(1, "Elvis",8.9f,7.8f,6.8f); // feedback on a scale of 1 to 10
		Elvis.calculateAverageFeedback();
		Elvis.calculateGrade();
		Elvis.displayInfo();
		
		System.out.println("\nSecond Employee details:\n");
		
		EmployeeGrade3 Martha = new EmployeeGrade3();
		Martha.initializeEmployee(2, "Martha",4.2f,4.4f);
		Martha.calculateAverageFeedback();
		Martha.calculateGrade();
		Martha.displayInfo();
		
	}
	
}
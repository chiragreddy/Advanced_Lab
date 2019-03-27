package assignment_8;

public class EmployeeGrade2 {

	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback; 
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	
	public void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
		
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feedback = customer2Feedback;
		this.customer3Feedback = customer3Feedback;

	}	
	
	public void calculateAverageFeedback() {
		averageFeedback = (customer1Feedback + customer2Feedback + customer3Feedback)/3;
	}
	
	public void calculateGrade() {
		
		for(int i = 0; i < 5; i++) {
			
			if(averageFeedback >= 80 && averageFeedback <= 100) {
				grade = 'A';
			}

			else if(averageFeedback >= 73 && averageFeedback <= 79) {
				grade = 'B';
			}

			else if(averageFeedback >= 65 && averageFeedback <= 72) {
				grade = 'C';
			}

			else if(averageFeedback >= 55 && averageFeedback <= 62) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			
		}
		
	}
	
	public void displayInfo() {
		
		System.out.println("The employee No of the employee: ");
		System.out.print(employeeNo +"\n");
		
		System.out.println("\n" + "The employee Name of the employee: "  );
		System.out.println(employeeName + "\n");
		
		System.out.println("The average feedback of the employee: " );
		System.out.print(averageFeedback + " ");
		
		
		System.out.println("\n\nThe grades of the employee: ");
		System.out.print(grade + " ");
		
	}
	
}

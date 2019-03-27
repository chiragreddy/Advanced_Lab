package assignment11;

public class EmployeeGrade8 {

	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback; 
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	
	public EmployeeGrade8() {
		employeeNo = 101;
		employeeName = "Ram";
		customer1Feedback = 8.9f;
		customer2Feedback = 5.0f;
		customer3Feedback = 9.3f;
	}
	
	public EmployeeGrade8(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feedback = customer2Feedback;
		this.customer3Feedback = customer3Feedback;
	}
	
	public int getEmployeeNo() {
		return employeeNo;
	}

	public void calculateAverageFeedback() {
		averageFeedback = (customer1Feedback + customer2Feedback + customer3Feedback)/3;
	}
	
	public void calculateGrade() {
		
		for(int i = 0; i < 5; i++) {
			
			if(averageFeedback >= 8 && averageFeedback <= 10) {
				grade = 'A';
			}

			else if(averageFeedback >= 7 && averageFeedback <= 7.9) {
				grade = 'B';
			}

			else if(averageFeedback >= 6.5 && averageFeedback <= 7.2) {
				grade = 'C';
			}

			else if(averageFeedback >= 5.5 && averageFeedback <= 6.2) {
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
		
		
		System.out.println("\n\nThe grade of the employee: ");
		System.out.print(grade + "\n");
		
	}
	
}
package assignment_2;

public class EmployeeGrade {
	
	public static void main(String[] args) {
		
		int employeeId[] = {1001,1002,1003,1004,1005};
		float customer1Feedback[] = {65.1f, 78.8f, 79.6f, 67.8f, 81.3f};
		float customer2Feedback[] = {89.3f, 87.2f, 83.4f, 69.8f, 84.6f};
		float customer3Feedback[] = {100.2f, 76.5f, 87.5f, 82.4f, 78.5f};
		float averageFeedback[] = new float[5];
		int intgrade[] = new int[5]; // int array of grades
		char grade[] = new char[5]; // char array of grades
		
		for(int i = 0; i < 5; i++) {
			averageFeedback[i] = (customer1Feedback[i] + customer2Feedback[i]+ customer3Feedback[i])/3;
		}
		
		for(int i = 0; i < 5; i++) {
			intgrade[i] = (int)averageFeedback[i];
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(intgrade[i] >= 80 && intgrade[i] <= 100) {
				grade[i] = 'A';
			}

			else if(intgrade[i] >= 73 && intgrade[i] <= 79) {
				grade[i] = 'B';
			}

			else if(intgrade[i] >= 65 && intgrade[i] <= 72) {
				grade[i] = 'C';
			}

			else if(intgrade[i] >= 55 && intgrade[i] <= 62) {
				grade[i] = 'D';
			}
			else {
				grade[i] = 'F';
			}
			
		}
		
		System.out.println("The employee Id of 5 employees: "  );
		
		for(int i = 0; i<5; i++) {	
			
			System.out.println(employeeId[i] + " ");
		
		}
		
		System.out.println("The average feedback of 5 employees: " );
		
		for(int i = 0; i<5; i++) {
			
			System.out.print(averageFeedback[i] + " ");
		}
		
		System.out.println("\nThe grades of 5 employees: " );
				
		for(int i = 0; i<5; i++) {
			
			System.out.print(grade[i] + " ");
		}
		
	}
	
}
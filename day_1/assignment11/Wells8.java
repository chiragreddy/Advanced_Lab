package assignment11;

public class Wells8 {

public static void main(String[] args) {

		EmployeeGrade8[] employee = new EmployeeGrade8[5]; // array of employee objects
		
		employee[0] = new EmployeeGrade8(102,"James",4.2f,4.4f,4.1f);
		employee[1] = new EmployeeGrade8(103,"Chirag",3.8f,2.8f,5.4f);
		employee[2] = new EmployeeGrade8(104,"John",6.2f,8.4f,4.5f);
		employee[3] = new EmployeeGrade8(105,"Chris",5.6f,4.2f,5.6f);
		employee[4] = new EmployeeGrade8(106,"Ryan",9.5f,8.2f,6.2f);
		
		for(int i = 0; i < employee.length; i++) {
			System.out.println("\nPrinting details of emolyee No: " + employee[i].getEmployeeNo() + "\n");
			employee[i].calculateAverageFeedback();
			employee[i].calculateGrade();
			employee[i].displayInfo();
		}
		
		
	}
	
}
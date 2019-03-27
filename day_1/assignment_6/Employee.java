package assignment_6;

import java.util.Date;

public class Employee {
	
	private String employeeName;
	private String accType;
	private String dateOfBirth;
	private char gender;
	private String maritalStatus;
	private String emailId;
	
	public Employee(String firstName, String lastName, String accType, String dateOfBirth, char gender, String maritalStatus, String emailId) {
		
		this.employeeName = firstName + lastName;
		this.accType = accType;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.emailId = emailId;
		
	}
	
	public static void main(String[] args) {
		
		Employee Employee1 = new Employee("Paul","Anderson","Salary","85-01-03",'M',"Single","Paul@Wellsfargo.com");
		Employee Employee2 = new Employee("John","Jacob","Non-Salary","85-03-06",'M',"Married","John@Wellsfargo.com");
		
		
	}
	
}
package assignment_5;
import java.util.*;

public class BankAccount {

	private int customerId;
	private int accNo;
	private String customerName;
	private String accType;
	private Date dateOfBirth;
	private char gender;
	private String maritalStatus;
	
	public BankAccount(String firstName, String lastName, String accType, Date dateOfBirth, char gender, String maritalStatus) {
		this.customerName = firstName + lastName;
		this.accType = accType;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getStudentName() {
		return customerName;
	}

	public String getAccType() {
		return accType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	public static void main(String[] args) {
		
		Date d = new Date(1994,03,21);
		BankAccount bankaccount = new BankAccount("Chirag","Jitta","Savings",d,'M',"Single");
		bankaccount.getCustomerId();
		bankaccount.getAccNo();
	}
}

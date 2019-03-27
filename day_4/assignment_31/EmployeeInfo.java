package assignment_31;

import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		ArrayList<Integer> employeeID = new ArrayList<Integer>();
		employeeID .add(1001);
		employeeID .add(1002);
//		employeeID .add("1003");
		
		for(int count = 0; count < employeeID.size(); count++) {
			int i = employeeID.get(count);
			System.out.println("The employeeID is: " + i);
		}
		
	}
	
}
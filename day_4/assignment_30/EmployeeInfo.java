package assignment_30;

import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.employeeID = 1001;
		Employee employee2 = new Employee();
		employee2.employeeID = 1002;
		Employee employee3 = new Employee();
		employee3.employeeID = 1003;
		Employee employee4 = new Employee();
		employee4.employeeID = 1004;
		
		List list = new ArrayList();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		// using for loop
		
//		for(int i = 0; i < list.size(); i++) {
//			Employee e = (Employee)list.get(i);
//			System.out.println(e.getEmployeeID());
//		}	
		
//		list.forEach((l)->System.out.println(l));   - using lambda expressions forEach loop
		
//		Using iterator approach to print elements of array list
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Employee e = (Employee)it.next();
			System.out.println("The employee ID is: " + e.getEmployeeID());
		}
	}
	
}

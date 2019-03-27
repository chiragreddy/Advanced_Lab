package assignment_22;

import java.util.Vector;
import java.lang.Integer;

public class Employee {
	public static void main(String[] args) {
		Vector empList = new Vector(); // not using Generics
		int empNo = 1000;
		for(int count = 0; count < 5; count++) {
			empNo++;
			Integer eNo = new Integer(empNo);
			empList.add(eNo);
		}
		
//		for(Object vector: empList) { // using Object type in for each loop
//			System.out.println(vector);
//		}
		
		empList.forEach((n) -> System.out.println(n)); // lambda expression
	}
}
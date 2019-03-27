package assignment_32;

import java.lang.reflect.*;

public class TestReflection {
		
	public static void main(String[] args) {
		
		try {
			Class classObj = Class.forName("assignment_32.Employee");
			Employee e = new Employee();
			
			// returns all the methods in the class to a method array
			Method[] methods = e.getClass().getMethods(); 
			
			System.out.println("The methods in the class Employee are: \n");
			
			for(int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
			}
			
			// returns all the fields in the class to a field array
			Field[] fields = e.getClass().getDeclaredFields();
			
			System.out.println("\nThe fields in the class Employee are: \n");
			
			for(Field field: fields) {
				System.out.println("Variable name: " + field.getName());
				System.out.println("Type name: " + field.getType());
			}
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}


package com.exception.assignment_25;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.exception.ExceptionDemo");
		}
		catch(ClassNotFoundException exception) {
			System.out.println("Exception: " + exception);
		}
	}
	
}

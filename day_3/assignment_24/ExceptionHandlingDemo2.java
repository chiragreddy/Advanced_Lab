package assignment_24;

public class ExceptionHandlingDemo2 {
	public static void main(String[] args) {
		String name = "John";
		int total = 100,count = 0;
		try {
			int average = total/count;
			System.out.println(average);
			System.out.println(name.length());
			System.out.println("End of try block");
		}
		catch(ArithmeticException exception) {
			System.out.println("Arithmetic Exception: " + exception.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Object is null");
		}
//		name = "John";
//		System.out.println(name.length());
		finally {
			System.out.println("within finally block");
		}
		System.out.println("Continuing the execution...");
		
	}
}

package assignment_33;

public class TestStringMock {
	public static void main(String[] args) {
		String message = "What's in the name";
		StringMock sm = new StringMock();
		System.out.println(sm.search("What", 'h'));
		System.out.println(sm.search("Hello", 'Y'));
	}
}

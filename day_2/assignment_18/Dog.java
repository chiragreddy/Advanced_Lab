package assignment_18;

public class Dog extends Animal implements PetAnimal{

	private boolean bark;
	
	public Dog(int eyes, int legs, boolean bark) {
		super(eyes, legs);
		this.bark = bark;
	}

	public void setBark(boolean bark) {
		this.bark = bark;
	}

	public boolean isBark() {
		return bark;
	}
	
	public void collarType (String type) {
		System.out.println("The collar type for dog is: " + type);
	}
	
	public void getHome(String home){
		System.out.println("The dog is located at: " + home);
	}
	
}

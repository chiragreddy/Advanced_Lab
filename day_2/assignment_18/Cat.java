package assignment_18;

public class Cat extends Animal implements PetAnimal{
	
	private String color;
	
	public Cat(int eyes, int legs, String color){
		super(eyes,legs);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public void collarType(String type) {
		System.out.println("The collar type for cat is: " + type);
	}
	
	public void getHome (String home) {
		System.out.println("The cat is located at: " + home);
	}
	
}

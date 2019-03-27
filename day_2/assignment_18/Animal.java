package assignment_18;

public class Animal {
	
	private int eyes;
	private int legs;
	
	public Animal(int eyes, int legs) {
		this.legs = legs;
		this.eyes = eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEyes() {
		return eyes;
	}

	public int getLegs() {
		return legs;
	}
	
}

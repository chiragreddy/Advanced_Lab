package assignment_18;

public class Hippo extends Animal{

	private boolean acquatic;
 
	public Hippo(int eyes, int legs, boolean acquatic) {
		super(eyes, legs);
	}

	public void setAcquatic(boolean acquatic) {
		this.acquatic = acquatic;
	}

	public boolean isAcquatic() {
		return acquatic;
	}
	
	
	
}

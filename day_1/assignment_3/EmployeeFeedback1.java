package assignment_3;

public class EmployeeFeedback1 {

	public static void main(String[] args) {
		
		int[][] empInfo = {{1001,4,5},{1002,2,4,5}};
		for(int outerLoop = 0; outerLoop < empInfo.length; outerLoop++) {
			for(int innerLoop = 0; innerLoop < empInfo[outerLoop].length; innerLoop++) {
				System.out.println(empInfo[outerLoop][innerLoop]);
			}
		}
		
	}
	
}
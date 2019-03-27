package assignment_12c;

public class Loan3 {
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	private static int loanCounter;
	
	private Loan3() {
		loanCounter++;
	}
	
	private Loan3(int accountNo, int customerNo,float loanAmount, int loanDuration, float interest ) {
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		loanCounter++;
	}
	
	public int getAccountNo() {
		return this.accountNo;
	}
	
	public int getCustomerNo() {
		return this.customerNo;
	}
	
	public float getLoanAmount() {
		return this.loanAmount;
	}
	
	public float getInterest() {
		return this.interest;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	
	public void setLoanDuration(int customerNo) {
		this.loanDuration = loanDuration;
	}
	
	public void setLoanAmount(int loanDuration) {
		this.loanAmount = loanAmount;
	}
	
	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	public static Loan3 getLoanInstance() { // factory method - Using static method to access the private constructors
		Loan3 loan = new Loan3();
		return loan;
	}
	
	public int getNumberOfObjects() {
		return loanCounter;
	}
	
}

package assignment_12a;

public class Loan {
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	static int loanCounter;
	
	public Loan() {
		loanCounter++;
	}
	
	public Loan(int accountNo, int customerNo,float loanAmount, int loanDuration, float interest ) {
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
	
	public static void main(String[] args) {
		Loan loan1 = new Loan();
		Loan loan2 = new Loan();
		Loan loan3 = new Loan();
		Loan loan4 = new Loan(10,101,500,6,5);
		Loan loan5 = new Loan(12,102,2000,12,4);
		Loan loan6 = new Loan(15,103,3000,18,8);
		System.out.println("Number of instances: " + loanCounter);
	}
	
}

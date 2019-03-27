package assignment_17;

public class Customer4 {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pincode;
	
	public Customer4() {
		System.out.println("Customer class default constructor");
	}
	
	public Customer4(int customerId,String customerName, String customerAddress, int pincode ) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.pincode = pincode;
		System.out.println("Customer class Parameterized constructor");
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public int getPincode() {
		return pincode;
	}
	
	
	
}

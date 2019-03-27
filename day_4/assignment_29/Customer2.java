package assignment_29;


public class Customer2 {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pincode;
	
	public void setCustomerId(int customerId) {
		// usage of this keyword if member variables have same name as local variables or parameters
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

package assignment_28;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pincode;
	
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

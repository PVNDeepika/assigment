package com.assignment1;

public class Customer { 
	 int customerid;
	 long customerContact;
	 String customerName,customerAddress;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void display() {
	     System.out.println("customerid: "  +customerid+"customerContact: " 
	        +customerContact+"customerName: "  +customerName+"customerAddress: "
	    		   +customerAddress);
	}
	
	 
}

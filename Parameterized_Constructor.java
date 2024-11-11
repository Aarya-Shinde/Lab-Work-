/**
 * Problem Statement- 1.Write a java program to create Bankcustomer class with 
 * acno,atype,amt fields using parameterized constructor?
 */
package Anudeep;

public class Parameterized_Constructor {
	
	//Declaring static class to store Customer's details
	public static class BankCustomer{
		
		int acno;
		String atype;
		float amt;
	
	//Creating parameterized constructor

	public BankCustomer(int acno, String atype, float amt) {
	    this.acno = acno;
	    this.atype = atype;
	    this.amt = amt;
	}
	
	// Getter for account number
	public int getAcno() {
		return acno;
	}
	// Setter for account number
	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	
	public float getAmt() {
		return amt;
	}

	
	public void setAmt(float amt) {
		this.amt = amt;
	}
	// Creating display Method to display account details of customemrs
	public void display() 
	{ 
		System.out.println("Account Number: " + acno); 
		System.out.println("Account Type: " + atype); 
		System.out.println("Amount: " + amt); }	
	}

public static void main(String[] args) {
		// Main method
		
		//Creating a new instance with info.
		BankCustomer Customer = new BankCustomer(25, "aarya",10000);
		//Displaying account details
		Customer.display();

	}

}

/*
 * Output-
Account Number: 25
Account Type: aarya
Amount: 10000.0

 * */

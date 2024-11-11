/*Problem Statement- 
1.Write a Java program to Create Bankcustomer class with acno,atype,amt fields 
using constructor overloading.
 */


package Anudeep;

public class bankCustomer {
	int acno;
	String atype;
	float amt;
	
	// Creating a Default constructor first 
	public bankCustomer() 
	{ 
		this.acno = 0; 
		this.atype = "god knows who"; 
		this.amt = 0; 
	}
 // Now creating anoter constructor with 2  parameters only(account number and type) 
	public bankCustomer(int acno, String atype) 
	{ 
		this.acno = acno;
		this.atype = atype; 
		this.amt = 0;
	}
	//creating another Parametrized constructor with( acno, atype, amt) 
	public bankCustomer(int acno, String atype, float amt) 
	{ 
		this.acno = acno; 
		this.atype = atype; 
		this.amt = amt; 
		}
	// Display Method to display all of the customer details 
	public void display()
	{
		System.out.println("Account Number: " + acno);
	    System.out.println("Account Type: " + atype);
	    System.out.println("Amount: " + amt);
	}
	//Main Method
	public static void main(String[] args) 
	{ 
		// Using default constructor to create default customer instance, hence every value will be 0
		bankCustomer customer1 = new bankCustomer();
		customer1.display();
		
		// Using parameterized constructor with only account number and type, hence the unchosen value will be 0(amt)
		bankCustomer customer2 = new bankCustomer(1001, "Savings");
		customer2.display(); 
		
		// Using parameterized constructor with all parameters account number, type, and amount, resulting with all values
		bankCustomer customer3 = new bankCustomer(2002, "Taking", 5000); 
		customer3.display(); 
	}
	}

/*Output
 * 
Account Number: 0
Account Type: god knows who
Amount: 0.0
Account Number: 1001
Account Type: Savings
Amount: 0.0
Account Number: 2002
Account Type: Taking
Amount: 5000.0

 
 * */

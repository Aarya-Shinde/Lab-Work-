/*Problem Statement- Create the bean class using Employee details(EmpId,EmpName,EmpAge,Empsalary)
*/
package Anudeep;

public class javabeanEmployee {

    // Creating variables for employee details
    int empId;
    String empName;
    int empAge;
    double empSalary;

    // Passing an no-argument constructor
    public javabeanEmployee() {
    }

    // Parameterized constructor to initialize employee details
    public javabeanEmployee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;  
        this.empName = empName;  
        this.empAge = empAge;  
        this.empSalary = empSalary; 
    }

    // Getter for employee ID
    public int getEmpId() {
        return empId;
    }

    // Setter for employee ID
    public void setEmpId(int empId) {
        this.empId = empId;
    }

     
    public String getEmpName() {
        return empName;
    }

     
    public void setEmpName(String empName) {
        this.empName = empName;
    }

     
    public int getEmpAge() {
        return empAge;
    }

     
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

     
    public double getEmpSalary() {
        return empSalary;
    }

     
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    // Creating display Method to display all employee details
    public void display() { 
        System.out.println("Employee ID: " + empId); 
        System.out.println("Employee Name: " + empName); 
        System.out.println("Employee Age: " + empAge); 
        System.out.println("Employee Salary: " + empSalary); 
    }

    //Declaing Main method
	public static void main(String[] args) {
		
		
		//Creating a new employee instance with info.
		javabeanEmployee employee = new javabeanEmployee(1, "Aarya Shinde", 20, 10000.00); 
		// Calling Display method
		employee.display(); } 
	
	}
/* Output-
 * 
 Employee ID: 1
Employee Name: Aarya Shinde
Employee Age: 20
Employee Salary: 10000.0
 
 
 * */

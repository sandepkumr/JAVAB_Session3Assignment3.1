/**
 * 
 */
package assignment3_1;

/**
 * Class to show the scope of Class variables and Instance variables
 *
 */
public class Assignment3_1 {	
	
	String employeeName;  		// Declaring Instance variable to store Employee Name
	long salary;				// Declaring Instance variable to store Salary of the Employee
	static String companyName; 	// Declaring company name as class variable 
	
	void display() { 			//Instance method to print employee details
		
		System.out.println(employeeName+" is a employee working in "+companyName+" with a salary of "+salary+" Rupees per month"); // Print employee details 
	}
	
	public static void main(String[] args) {			// main method starts
		
		Assignment3_1 employee1 = new Assignment3_1();	// Creating object employee1
		
		employee1.employeeName="Sandeep Kumar";			// employeeName is only accessible using object(employee1) in static main
		employee1.salary=100000;						// salary is only accessible using object(employee1) in static main
		companyName="Tata Consultancy Services Ltd.";	// Assigning company name without object
		
		Assignment3_1 employee2 = new Assignment3_1();	// Creating object employee1
		employee2.employeeName="Rajesh Agarwal";		// employeeName is only accessible using object(employee2) in static main
		employee2.salary=50000;							// salary is only accessible using object(employee2) in static main
		
		employee1.display();							// Printing employee1 details using display method
		employee2.display();							// Printing employee2 details using display method
		
		
	}

}// Class closed

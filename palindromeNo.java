/* Problem Statement- 1.Write a java program to find given no is palindrome or not.
 * */

package Anudeep;
import java.util.Scanner;

public class palindromeNo {

	public static void main(String[] args) {
		//Declaring main method for class
		Scanner input = new Scanner(System.in);
		//Declaring variable named input to hold new scanner object
		System.out.print("Enter any number: "); 		
		int number = input.nextInt(); 
		//assigning next integer value to number
		
		// Store the original number for later comparison 
		int originalNo = number; 
		int reversedNo = 0; 
		
		
		// Reversing the number by using arthimetic operator, usind moduls
		while (number != 0) 
		{ 
			int digit = number % 10;
			reversedNo = reversedNo * 10 + digit; 
			number /= 10; 
			
		} 
		// if-else statement to check if original number is equal to its reversed version 
		
		if (originalNo == reversedNo) 
		{ 
			System.out.println("The number " + originalNo + " is a palindrome."); 
		} 
		else 
		{ 
			System.out.println("The number " + originalNo + " is not a palindrome."); 
		}  
	} 
}

/*Output-
 *Enter any number: 7557
The number 7557 is a palindrome.
 */


/*Problem Statement- Write a java program to find largest among three nos.
 * */

package Anudeep;
import java.util.Scanner;

public class largestNo {

	public static void main(String[] args) {
		//Declaring main method for class
		
		Scanner input = new Scanner(System.in);
		//Declaring variable named input to hold new scanner object
		
		System.out.println("Enter the First Number-");
		int num1 = input.nextInt();
		//assigning next integer value to num1
		
		System.out.println("Enter the Second Number-");
		int num2 = input.nextInt();
		//assigning next integer value to num2
	
		System.out.println("Enter the Third Number-");
		int num3 = input.nextInt();
		//assigning next integer value to num3
		
		//If else statement using logical and Relational Operators
		if(num1 >= num2 && num1 >= num3) 
		{
			System.out.print("First number is the largest one");
		}
		else if(num2 >= num1 && num2 >= num3)
		{
			System.out.print("Second number is the largest one");
		}
		else {
			System.out.print("Third number is the largest one");
		}
	}
}

	
/*Output-
 * Enter the First Number-
78
Enter the Second Number-
46
Enter the Third Number-
26
First number is the largest one
 */

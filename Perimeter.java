/*2. Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.

Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r

From Understanding of Java constructors and inheritance
*/
package Anudeep;

public class Perimeter {
	
	//Creating method to calculate the parameter of square
	public int formulasq(int sides) 
	{ 
		return 4 * sides; 
	}
	//Creating method to calculate the parameter of rectangle 
	public int formularec(int length, int breadth) 
	{ 
		return 2 * (length + breadth);
	}
	//Creating method to calculate the perimeter of circle
	public int formulacircle(int radius) 
	{
	    return 2 * (22 * radius) / 7;
	}

	public static void main(String[] args) {
		
		// creating a instance called permieter to access methods
		Perimeter perimeter = new Perimeter();
		
		int square = perimeter.formulasq(10); 
		// Giving value to method for calculating square
		System.out.println("Perimeter of  square is: " + square); 
		
		// Giving value to method for calculating rectangle
		int rectangle = perimeter.formularec(10, 1); 
		System.out.println("Perimeter of rectangle is: " + rectangle); 
		
		// Giving value to method for calculating circle
		int circle = perimeter.formulacircle(5); 
		System.out.println("Perimeter of circle is: " + circle);
		
	}

}
/* Output-
Perimeter of  square is: 40
Perimeter of rectangle is: 22
Perimeter of circle is: 31
*/

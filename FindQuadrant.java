/*

Written by Nader K
Date: 1/22/2012
Purpose: This program prompts the user to imput the x-y coordinate of a point in a Cartesian plan.
	The program then outputs a message indicating whether the point is the origin,
	is located on the x (or y) axis, or appears in a particular quadrant. 
*/

import java.util.*;

public class FindQuadrant
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		int x;
		int y;
		
		System.out.print("Enter the value of x: ");
		System.out.flush();     
		x = console.nextInt();
		
		System.out.print("Enter the value of y: ");
		System.out.flush();     
		y = console.nextInt();
		
		System.out.println(); // create a blank line, to make the output easier to read.
		
		if(x == 0 && y == 0)
			System.out.println("The point " + "(" + x + "," + y + ")" + " is the origin.");

		else if(x == 0 && y != 0)
			System.out.println("The point " + "(" + x + "," + y + ")" + " is on the y-axis.");
			
		else if(x != 0 && y == 0)
			System.out.println("The point " + "(" + x + "," + y + ")" + " is on the x-axis.");
			
		else if(x > 0 && y > 0)
			System.out.println("The point " + "(" + x + "," + y + ")" + " is in the first quadrant.");
			
		else if(x < 0 && y > 0)
			System.out.println("The point " + "(" + x + "," + y + ")" + " is in the second quadrant.");
			
		else if(x < 0 && y < 0)
			System.out.println("The point " + "(" + x + "," + y + ")" + " is in the third quadrant.");
							
		else //if(x > 0 && y < 0)
			System.out.println("The point " + "(" + x + "," + y + ")" + " is in the fourth quadrant.");
		
		}//end main

}//end class
/* MaxNum.java: Reads positive numbers and prints their maximum. Stops reading new numbers when a negative number is inserted.  

Name: Nicole Issagholian

Date: 9/27/2021
*/

import java.util.Scanner;

public class MaxNum
{
	public static void main(String[] args)
	{
		//creates a Scanner object
		Scanner data = new Scanner(System.in);

		//intializes and declares a variable representing the largest number
		double largestNum = 0;


		//asks the user to input numbers
		System.out.println("Insert numbers (terminate with negative number): ");

		System.out.print("> ");
		
		//reads user input for numbers
		double userNum = data.nextDouble();


		//uses a while loop that finds the largest number and sets it equal to the "largest" variable
		while (userNum >= 0)
		{
			if (userNum > largestNum) 
			{
				largestNum = userNum;
			}
			System.out.print("> ");
			userNum = data.nextDouble();
		}

		//prints the largest number
		System.out.println("\nTheir maximum is " + largestNum);
	}
}


import java.util.Scanner;	//Needed for the scanner class

/**
 * This program reads numeric and string inputs
 *
 * @author Ryan Hickman
 *
 */

public class Inputs 
{
	public static void main (String [] args)
	{
		String name;	//Holds the user's name
		int age;		//Holds the user's age
		double income;	//Holds the user's income
		
		//Creates a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		//Get the user's age
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		//Get the user's income
		System.out.print("What is your annual income? ");
		income = keyboard.nextDouble();
		
		//consumer the remaining newline
		keyboard.nextLine();
		
		//Get the user's name
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		//Display the information back to the user
		System.out.println("Hello " + name + ". Your age is " + age + " and your income is $" + income);
	}

}

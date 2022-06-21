/*
Username generator and factorial calculator
Finlay Coull 16005976
A Program that can be used to generate a username based on an inputted first and last name and can calculate a factorial
2019-11-14
*/

package finalAssessment;

import java.util.Scanner;																	//Import keyboard scanner

public class Assessment {
	
	static Scanner kboard = new Scanner(System.in);											//Initialise keyboard scanner
	
	public static String getName()															//Get name function
	{
		String newName;
		newName = kboard.next();
		return newName;
	}
	
	public static String generateUsername(String newFirstName, String newLastName)			//Generate username function
	{
		String newUsername;
		newUsername = newFirstName.toLowerCase().charAt(0) + newLastName.substring(0,1).toUpperCase() + newLastName.substring(1).toLowerCase();
		return newUsername;
	}
	
	public static int getInputNumber()														//Get input number for factorial function
	{
		int newInputNumber;
		System.out.println("Please enter a number to work out the factorial for:");
		newInputNumber = kboard.nextInt();
		return newInputNumber;
	}
	
	public static int calculateFactorial(int inputNumberForCalculation)						//Calculate factorial function
	{
		int newTotal = 1;
		for (int i = 1; i <= inputNumberForCalculation; i++)
		{
			newTotal = newTotal * i;
		}
		return newTotal;
	}
	
	
	public static void displayAnswer(int inputNumberForDisplay, int totalForDisplay)		//Display factorial function
	{
		for (int i = inputNumberForDisplay; i >= 1; i--)
		{
			if (i > 1)
		  	{
				System.out.print(i + " * ");
		  	}
			else
	  		{
				System.out.print(i);
	  		}
		}
		System.out.println(" = " + totalForDisplay);
		System.out.println("Factorial = " + totalForDisplay);
	}

	public static void main(String[] args) {
		
		int option = 0;																		//Menu option variable
		
		String firstName;																	//First name variable
		String lastName;																	//Last name variable
		String username;																	//Username variable
		
		int inputNumber;																	//Input number for factorial variable
		int total;																			//Total factorial variable
		
		do
		{
			System.out.println("Would you like to:");										//Print menu options
			System.out.println("1. Generate a username based on first and last name?");
			System.out.println("2. Calculate the factorial of a number?");
			System.out.println("3. Exit the program?");
			option = kboard.nextInt();														//Select menu option
			
			switch(option)
			{
			case 1:																			//Generate username option
				System.out.println("Please enter your first name:");
				firstName = getName();
				
				System.out.println("Please enter your last name:");
				lastName = getName();
				
				username = generateUsername(firstName, lastName);
				System.out.println(username);
				break;
			case 2:																			//Calculate factorial option
				inputNumber = getInputNumber();
				total = calculateFactorial(inputNumber);
				displayAnswer(inputNumber, total);
				break;
			case 3:																			//Exit program option
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Please enter a valid menu option");
			}
		}
		while (option != 3);
		
		kboard.close();																		//Close keyboard scanner

	}

}
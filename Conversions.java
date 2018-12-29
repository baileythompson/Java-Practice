// Author: Bailey Thompson
// Date: March 21,2018
// Description: Assignment 6, Fahrenheit and Celsius Conversions. Complete exercise 6.22 on page 240 to perform temperature conversions. Submit your .java and .class files as well as screenshots of output for testing with the following data: F = 100; calculate C, C = 212 calculate F, C = 32 calculate F. Use two methods - one to convert Fahrenheit to Celsius  and another method to convert Celsius to Fahrenheit.
// Sources: Java How to Program, Tutor Ryan Bonisch from Wyzant online tutoring, session March 22, 2018, 7 - 9 p.m.

import java.util.Scanner; // program uses class scanner
public class Conversions // create public class Conversions
{
	
	public static double inCelsius() // Celsius conversion method begins execution of celsius to fahrenheit conversion program
	{
		Scanner in = new Scanner(System.in); // create a Scanner to obtain temperature input from the command window
		
		System.out.print("Enter a Celsius Temperature :"); // program prints statement that prompts user to enter a Celsius temperature
		double fahrenheit = in.nextDouble(); // initializes fahrenheit variable, following statements calcuate fahrenheit conversion from entered Celsius temperature
		double F = (9.0 / 5.0) * fahrenheit + 32;
		return F;
		
	}
	public static double inFahrenheit() // Fahrenheit conversion method begins execution of fahrenheit to celsius conversion program
	{		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit Temperature :"); // program prints statement that prompts user to enter a Fahrenheit temperature
		double celsius = in.nextDouble(); // initializes celsius variable, following statements calcuate celsius conversion from entered Fahrenheit temperature
		double C = (5.0 / 9.0) * ( celsius - 32);
		return C;
	}
  
  public static void main(String[] args){ 
    Scanner input = new Scanner(System.in);
    boolean looping = true; 
        
    while(looping){ // statement and following statements begin loop statement to continue prompting user to enter F and C or until Q is entered

      System.out.print("Please enter capitalized 'F' for fahrenheit, capitalized 'C' for celsius, or capitalized 'Q' to quit: ");
      String response = input.next();
      char letter = response.charAt(0);
      double calculation = 0.0;
      
      switch(letter){
        case 'F':
          calculation = inFahrenheit();
          break;
        case 'C':
          calculation = inCelsius();
          break;
        case 'Q':
          looping = false;
          break;
        default:
          System.out.println("INVALID RESPONSE!!!  Please try again!"); 
      }
      if (calculation != 0.0){
        System.out.printf("Your temperature is %.1f%c\n", calculation, (letter == 'F') ? 'C' : 'F'); // displays calculation
      } // end switch statement
    } // end while loop
  } // end methods
} // end public class Conversions
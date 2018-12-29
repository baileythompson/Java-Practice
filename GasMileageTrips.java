// Author Bailey Thompson
// Date: February 22, 2018
// Assigment: Drivers are concerned with the mileage their automobiles get. One driver has
// kept track of several trips by recording the miles driven and gallons used for
// each tankful.
//
// Develop a Java application that will input the miles driven and gallons used
// (both as integers) for each trip.
//
// The program should calculate and display the miles per gallon obtained for each
// trip and print the combined miles per gallon obtained for all trips up to this point.
// 
// All averaging calculations should produce floating-point results. Use class Scanner
// and sentinel-controlled repetition to obtain the data from the user.

import java.util.Scanner;

public class GasMileageTrips // begin class GasMileageTrips
{
  // begins main method
  public static void main ( String [] args ) {
    Scanner input = new Scanner (System.in); 
    int milesDriven = 0; // defines and initializes variable
    int gallonsUsed = 0; // defines and initializes variable
    int counter = 0; // defines and initializes variable
    int totalMileage = 0; // defines and initializes variable
    int numberOfTrips = 1; // defines and initializes variable
    
    // prompts user to enter how many trips they are calculating gas mileage for
    System.out.print("How many trips would you like to calculate gas mileage for: ");
    numberOfTrips = input.nextInt();
    
   // loops the same prompts for the user to enter miles drivena nd gallons used and displays their miles per gallon and total mileage
    while(counter<numberOfTrips)
    {
      System.out.println("Please enter Miles Driven");
      milesDriven=input.nextInt();
      System.out.println("Please enter Gallons Used");
      gallonsUsed=input.nextInt();
      
      float tripCost = (milesDriven / gallonsUsed); // calculate trip cost
      totalMileage += milesDriven;
      counter++;
      
      System.out.printf("Your miles per gallon was %.2f, and total Mileage was %d\n", tripCost, totalMileage);
    }
  } // end main method
} // end class GasMileageTrips
  
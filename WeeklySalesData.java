// Author: Bailey Thompson
// Date: March 30, 2018
// Source: Java: How to Program, Wyzant.com tutor Ryan Bonisch
// Write a program using an array that will process sales data for a week. 
// Create an array that will store input data for the daily sales for a week (7 days). 
// Using the array data determine the total sales for the week, the day of the week with the least number of sales and the day of the week with the highest sales.

import java.util.Scanner; // imports Scanner

public class WeeklySalesData // creates public class WeeklySalesData
{
  public static int leastSaleDay(double[] array){ // creates method to find the day of the week with the least sales
    double leastVal = 999999; // set method to hold the least value 
    int index = 0; // hold on to the indexed least value
    
    for (int i = 0; i < array.length; i++){ // loops through each entry 
      if (array[i] < leastVal) { // compares current element in the array to whatever is the least recorded value
        leastVal = array[i]; // if current element is lesser than least recorded, sets leastVal to this element
        index = i; // holds onto the new least value
      }
    }
    
    return index; // returns the index of the day in the array that has the least value
  }
  
  public static int mostSaleDay(double[] array){ // creates method to find the day of the week with the most sales
    double mostVal = 0.0; // set method to hold the most value 
    int index = 0; // hold on to the indexed most value
    
    for (int i = 0; i < array.length; i++) { // loops through each entry 
      if (array[i] > mostVal) { // compares current element in the array to whatever is the most recorded value
        mostVal = array[i]; // if current element is greater than most recorded, sets mostVal to this element
        index = i; // holds onto the new most value
      }
    }
    
    return index; // returns the index of the day in the array that has the most value
  }
  
  public static void main( String[] args ) { // executes main method that creates array of days
    Scanner input = new Scanner(System.in); // creates new Scanner object called input
    int numberOfDays = 7; // sets size of array
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; // declares array's elements
  	double [] array = new double[ numberOfDays ]; // create the array for the week, initializes array
    double totalValue = 0.0; // stores totalValue (total weekly sales data)
  
    for (int i = 0; i < numberOfDays; i++) { // prompts user to enter each sales amount for each day in String[] days (7 times)
      System.out.printf("Enter %s's sale data: ", days[i]); 
      array[i] = input.nextDouble(); // user inputs data into the array
      totalValue += array[i]; // adds each value to totalValue
    }
  
    System.out.printf("The total sales for the week was $%.2f\n", totalValue); // displays total weekly sales
    System.out.printf("The day with the least sales was %s\n", days[leastSaleDay(array)]); // displays day with least sales
    System.out.printf("The day with the most sales was %s\n", days[mostSaleDay(array)]); // displays day with most sales
  } // end method main
} // end public class WeeklySalesData 
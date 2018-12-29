// Author: Bailey Thompson
// Date: 2/27/2018
// Sources: "Java: How to Program," and Java tutor 
// Description: Determine Loan Interest Rate based on credit scores. 
// Use if..else statements to find the interest rate. Write a program that will give the interest rate for a new car loan based on a credit score. 

// Credit score Interest Rate
// 850-720 5.56%
// 719-690 6.38%
// 660 689 7.12%
// 625-659 9.34%
// 590-624 12.45%
// Below 590 no credit issued.

// Prompt the user for the credit score.  Determine and display the user input credit score and the interest rate associated with the credit score.

// Use a complete program heading - name, date, assignment name, assignment description and specific sources used to complete the assignment.  Also use comments to describe your program segments.

// Submit your .java, .class and screenshots as a zip file in this D2L link.  

import java.util.Scanner;

public class LoanInterestRate{ // define class
  public static void main(String[] args){ // begin main method
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter your credit score: "); // Prompts user for credit score
    int creditScore = input.nextInt(); // declare & intialize creditScore as a variable to store integer
    
    double interestRate; // declare interestRate as a variable
    
    if (creditScore > 850) { // prints error if user enters score higher than 850
      interestRate = 0.0;
      System.out.println("Error! creditScore cannot be higher than 850");
    } else if (creditScore <= 850 && creditScore >= 720){ // if credit score is between these values, interest rate is 5.56
      interestRate = 5.56;
    } else if (creditScore <= 719 && creditScore >= 690) { // if credit score is between these values, interest rate is 6.38
      interestRate = 6.38;
    } else if (creditScore <= 689 && creditScore >= 660) { // if credit score is between these values, interest rate is 7.12
      interestRate = 7.12;
    } else if (creditScore <= 659 && creditScore >= 625) { // if credit score is between these values, interest rate is 9.34
      interestRate = 9.34;
    } else if (creditScore <= 624 && creditScore >= 590) { // if credit score is between these values, interest rate is 12.45
      interestRate = 12.45;
    } else {  // if value is less than 590, sets interest rate to 0.0
      interestRate = 0.0;
      System.out.println("Credit score too low to be approved");
    }
    
    if (interestRate > 0.0) {
      System.out.printf("Your credit score is %d which has an associated interest rate of %.2f%%\n", creditScore, interestRate); // Displays associated interest rate with credit score
    } // end condition
  } // end main method
} // end class LoanInterestRate

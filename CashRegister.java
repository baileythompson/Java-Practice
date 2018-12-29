// Bailey Thompson.
// January 30, 2018.
// CashRegister.java
// Cash register program that prompts the user to input the price of three items, adds them together to get a subtotal, determines a 6% tax on the subtotal, calculates the total amount of the sale subtotal plus the tax, then displays the price of each item, subtotal amount, tax amount and final amount.

import java.util.Scanner; // program uses class Scanner

public class CashRegister
{

   // main method begins execution of Java application
   public static void main(String[] args) 
   {
   // create a Scanner to obtain input from the command window
   Scanner input = new Scanner( System.in );
                     
      System.out.print( "Enter price of first item: $ " ); // prompt
      double number1 = input.nextDouble(); // read first number from user
      
      System.out.print( "Enter price of second item: $ " ); // prompt
      double number2 = input.nextDouble(); // read second number from user
      
      System.out.print( "Enter price of third item: $ " ); // prompt
      double number3 = input.nextDouble(); // read third number from user
      
      double subtotal = ((number1) + (number2) + (number3)); // add numbers, then store total in subtotal
      System.out.printf( "The subtotal is $%s\n", String.format("%.2f", subtotal)); // display subtotal  
      
      double salestax = .06;
      
      double subtotalnotax = ((subtotal) * (.06)); // multiply numbers, then store total in subtotalnotax
      System.out.printf( "subtotalnotax is subtotal * .06 $%s\n", String.format("%.2f", subtotalnotax)); // display subtotalnotax
      
      double total = subtotal + subtotalnotax; // add numbers, then store sum in total
      System.out.printf( "Total is subtotal + subtotalnotax $%s\n", String.format("%.2f", total));  // display total
                        
   } // end method main
} // end class CashRegister
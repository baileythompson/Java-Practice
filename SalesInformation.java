import java.util.Scanner; 

public class SalesInformation { // creates class SalesInformation
  public static void main(String[] args) { // begin main method
    Scanner input = new Scanner(System.in); // create new Scanner for system input
    
    float product1 = 6.98f; // declare and initialize each product as a float variable
    float product2 = 7.50f;
    float product3 = 3.75f;
    float product4 = 2.59f;
    float product5 = 23.79f;
    float commissionRate = 0.05f;
    float total = 0.0f;
    boolean sentinel = true; // declare and initialize sentinel value 
    
    while(sentinel) {
      System.out.print("Please enter the number of the product to which you sold, or 0 for exit: "); // prompts user for product number
      int saleProductNum = input.nextInt(); // initialize saleproductnum to whichever product number the user enters
      int quantitySold = 0; 
      if (saleProductNum > 0 && saleProductNum <= 5) { // if user enters product number greater than zero but less than or equal to five, prompt user to enter quantity 
        System.out.print("Please enter the quantity sold: ");
        quantitySold = input.nextInt();
      }
      switch (saleProductNum) { // program locates the number entered by the user in the following cases
        case 0: // entering 0 prompts the total sales
          System.out.printf("\nTotal sales came to %.2f multiplied by a commission rate of %.2f came to %.2f\n", total, commissionRate, total + (total * commissionRate));
          sentinel = false; // stops the loop
          break;
        case 1: // if user entered 1, program multiplies productNum by quantitySold
          total += product1 * quantitySold; 
          break;
        case 2: // if user entered 2, program multiplies productNum by quantitySold 
          total += product2 * quantitySold;
          break;
        case 3: // if user entered 3, program multiplies productNum by quantitySold 
          total += product3 * quantitySold;
          break;
        case 4: // if user entered 4, program multiplies productNum by quantitySold 
          total += product4 * quantitySold;
          break;
        case 5: // if user entered 5, program multiplies productNum by quantitySold 
          total += product5 * quantitySold;
          break;
        default:
          System.out.println("That was not a valid entry!!! Please try again!"); // if user enters number other than 0-5, program defaults
          break;
      } // end switch
    } // end while loop
  } // end main method
} // end class SalesInformation




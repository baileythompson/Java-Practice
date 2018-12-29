// Bailey Thompson
// February 1, 2018
// This program calculates the perimeter and area of a rectangle. It will first prompt the user to enter the length and width of the rectangle, then calculate the area as length * width. Next it will calculate the perimeter as 2 * length + 2 * width. Finally, the program will display the area and perimeter of the rectangle.

import java.util.Scanner;

public class PerimeterAreaRectangle {
    public static void main(String args[]) {
        float length;
        float width;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = in.nextFloat();
        
        System.out.println("Enter the width: ");
        width = in.nextFloat();
        
        float perimeter = 2*length + 2*width;
        float area = length*width;
        
        System.out.println("The perimeter for the rectangle is: " + perimeter);
        System.out.println("The area for the rectangle is: " + area);
    }
}
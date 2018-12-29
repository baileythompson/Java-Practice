import java.util.Scanner;
 
public class InvoiceTester {
    public static void main (String [] args) {
 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvoiceTest {

    public static void main(String[] args) throws IOException {
        testInvoiceClass();
    }

    public static void testInvoiceClass() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Part Number and press enter");
        String partNumber = bufferedReader.readLine();
        
        System.out.println("Enter Part Description and press enter");
        String partDescription = bufferedReader.readLine();
        
        System.out.println("Enter Quantity and press enter");
        int quantity = Integer.parseInt(bufferedReader.readLine());
        
        System.out.println("Enter Price and press enter");
        double price = Double.parseDouble(bufferedReader.readLine());
        
        
        Invoice invoice = new Invoice(partNumber, partDescription, quantity, price);
        double invoiceAmount = invoice.getInvoiceAmount();
        System.out.println("Part - " + invoice.getPartNumber());
        System.out.println("Description - " + invoice.getPartDescription());
        System.out.println("Quantity - " + invoice.getQuantity());
        System.out.println("Item Price - " + invoice.getPricePerItem());
        System.out.println("-------------------------------------------");
        System.out.println("Invoice amount - " + invoiceAmount);
    }
}
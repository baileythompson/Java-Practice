// Author: Bailey Thompson
// Date: February 14,2018
// Description: "Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables — a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0."

public class Invoice 
{
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   
   public Invoice( String part, String description, int count, 
      double price )
   {
      partNumber = part;
      partDescription = description;

      if ( count > 0 ) // if count is positive
         quantity = count; // count assigned to quantity

      if ( price > 0.0 ) // if price is positive
         pricePerItem = price; // price assigned to pricePerItem
   } 

   // set part number method
   public void setPartNumber( String part )
   {
      partNumber = part;  
   } 

   // get part number method
   public String getPartNumber()
   {
      return partNumber;
   } 

   // set description method
   public void setPartDescription( String description )
   {
      partDescription = description;
   } 

   // get description method
   public String getPartDescription()
   {
      return partDescription;
   } 

   // set quantity method
   public void setQuantity( int count )
   {
      if ( count > 0 ) // if count is positive
         quantity = count; //  count assigned to quantity

      if ( count <= 0 ) // if count is zero or negative
         quantity = 0; // quantity set to 0
   } 

   // get quantity method
   public int getQuantity()
   {
      return quantity;
   }

   // set price per item method
   public void setPricePerItem( double price )
   {
      if ( price > 0.0 ) // if price is positive
         pricePerItem = price; //  price assigned to pricePerItem

      if ( price <= 0.0 ) // if price is zero or negative
         pricePerItem = 0.0; // pricePerItem set to 0.0
   } 

   // get price per item method
   public double getPricePerItem()
   {
      return pricePerItem;
   } 

   // mutilplies quantity by price per item and returns the invoice amount
   public double getInvoiceAmount() 
   {
      return getQuantity() * getPricePerItem(); // calculate total cost
   } // end method getPaymentAmount
} // end class Invoice

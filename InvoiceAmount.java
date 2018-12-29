public class InvoiceAmount
{
   private String PartNumber;
   private String PartDescription;
   private int Quantity;
   private double PricePerItem;
   
   public InvoiceAmount(){
      PartNumber = "";
      PartDescription = "";
      Quantity = "";
      PricePerItem = 0;
   }
   
   public Invoice(String pn, String pd, int q, double ppi)
   {
      PartNumber = pn;
      PartDescription = pd;
      Quantity = q;
      PricePerItem = ppi;
   }
   
   public void setPartNumber(String pn){
      PartNumber = pn;
   }
   
   public void setPartDescription(String pd){
      PartDescription = pd;
   }
   
   public void setQuantity(String q){
      Quantity = q;
   }
   public void setPricePerItem(double ppi){
      PricePerItem = ppi;
   }
   public void String (getPartNumber){
      return PartNumber;
   }
   public void String (getPartDescription){
      return PartDescription;
   }
   public void String (getQuantity){
      return Quantity;
   }
   public double (getPricePerItem){
      return PricePerItem;
   }
   
   public double getInvoiceAmount(int PricePerItem){
      double InvoiceAmount;
      
      InvoiceAmount = Quantity * PricePerItem;
      
      return InvoiceAmount;
      
   }
}
      
        
   
   
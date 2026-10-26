public class CellPhone
{
   private String manufact;
   private int model;
   private double retailPrice;
   
   public CellPhone()
   {
    manufact="";
    model=0;
    retailPrice=0;
   }
   public CellPhone(String manufact, int model, double retailPrice)
   {
    this.manufact=manufact;
    this.model=model;
    this.retailPrice=retailPrice;
   }
   public void setManufact(String manufact)
   {
    this.manufact=manufact;
   }
   public void setModel(int model)
   {
    this.model=model;
   }
   public void setRetailPrice(double retailPrice)
   {
    this.retailPrice=retailPrice;
   }
   public String getManufact()
   {
    return manufact;
   }
   public int getModel()
   {
    return model;
   }
   public double getRetailPrice()
   {
    return retailPrice;
   }
   public String toString()
   {
    String str= "The manufact is " + manufact + "the model number is " + model + "the retail price is " + retailPrice;
    return str;
   }
}

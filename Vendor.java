/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
    // Instance Variables:
	private int stock; 
	private int price; 
	private int deposit; 
	private int change; 

  private static double totalSales = 0.0; 
    	

public static double getTotalSales()
	{
	    double sales = totalSales;
	    totalSales = totalSales ;
	    return sales;
	}



   
		
	
	
   public Vendor(int price, int stock){ 
       this.price = price; 
       this.stock = stock; 
       deposit = 0; 
       change = 0; 
} 

    
       
     
    
    
	
	
	
	   public void setStock(int stock){ 
       stock  =  stock; 
} 
	
	
	
     public int getStock() { 
       return stock; 
} 
	
	
	
    public void addMoney(int amount){ 
       deposit += amount;
} 
	
	
	
    public int getDeposit() {
       return deposit; 
   }
	
	
	
   public boolean makeSale() { 
       if (stock > 0 && deposit >= price) {
           stock--; 
           change = deposit - price; 
           deposit = 0; 
           totalSales += price / 100.0;
           return true; 
       } else { 
           change = deposit; 
           deposit = 0; 
           return false; 
       }
}
	
	
	
   public int getChange() { 
       int temp = change; 
       change = 0; 
       return temp; 
   }
}
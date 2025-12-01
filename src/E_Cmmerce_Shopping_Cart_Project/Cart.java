package E_Cmmerce_Shopping_Cart_Project;

import java.util.ArrayList;
import java.util.List;

public class Cart {

         private List<Product>cart=new ArrayList<>();
         

         public void addproduct(Product p,int qty) throws OutOfStockException { 

        	 if(p.getQuantity()<qty) throw new OutOfStockException("product nahi hai");
        	 {
        		 cart.add(p);
        		 System.out.println("product add ");
        	 }
        		 
         }

         public double calculateTotal() {
             double sum = 0;
             for (Product p : cart) {
                 try {
                     sum += p.applyDiscount(p.getPrice());
                 } catch (InvalidCouponException e) {
                     System.out.println("Discount not applied: " + e.getMessage());
                     sum += p.getPrice();
                 }
             }
             return sum;
         }


         
}

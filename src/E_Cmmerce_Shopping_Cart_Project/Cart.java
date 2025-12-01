package E_Cmmerce_Shopping_Cart_Project;

import java.util.ArrayList;
import java.util.List;

public class Cart {

         private List<Product>cars=new ArrayList<>();

         public void addproduct(Product p,int qty) throws OutOfStockException { 

        	 if(p.getQuantity()<qty) throw new OutOfStockException("product nahi hai");
        	 {
        		 cars.add(p);
        		 System.out.println("product add ");
        	 }
        		 
         }

         public void removeProduct(Product p) {
        	 
             cars.remove(p);
             System.out.println("Product removed successfully.");
         }

         public double calculateTotal() {
             double sum = 0;
             for (Product p : cars) {
                 sum += p.applyDiscount(double price)throws InvalidCouponException;
            
             
             return sum;
         }

}

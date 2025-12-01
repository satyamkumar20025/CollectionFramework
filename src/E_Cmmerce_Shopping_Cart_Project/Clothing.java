package E_Cmmerce_Shopping_Cart_Project;

public class Clothing  extends Product {

	/**
	 * @param productId
	 * @param productName
	 * @param price
	 * @param quantity
	 */
	public Clothing(int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);
	}

	@Override
	public String toString() {
		return "Clothing [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	@Override
	void getDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double applyDiscount(double price) throws InvalidCouponException {
		// TODO Auto-generated method stub
		
		return price*0.98;
	}

	
	
	
}

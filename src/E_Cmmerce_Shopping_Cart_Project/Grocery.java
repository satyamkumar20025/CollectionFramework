package E_Cmmerce_Shopping_Cart_Project;

public class Grocery  extends Product {

	/**
	 * @param productId
	 * @param productName
	 * @param price
	 * @param quantity
	 */
	public Grocery(int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);
	}

	@Override
	public String toString() {
		return "Grocery [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
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

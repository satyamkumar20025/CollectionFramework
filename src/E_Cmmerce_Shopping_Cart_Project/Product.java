package E_Cmmerce_Shopping_Cart_Project;

public abstract class Product implements Discountable {

	protected int productId;
	protected String productName;
	protected double price;
	protected int quantity=9;
	/**
	 * @param productId
	 * @param productName
	 * @param price
	 * @param quantity
	 */
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	abstract void getDetails();
}

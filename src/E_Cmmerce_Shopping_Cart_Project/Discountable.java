package E_Cmmerce_Shopping_Cart_Project;

public interface Discountable {

	public double applyDiscount(double price) throws InvalidCouponException;
}

package clothingstore;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import clothingstore.models.Product;

public class Cashier {
	
	private DecimalFormat df = new DecimalFormat("0.00");
	
	private double subtotal;
	private double discountTotal;
	private double totalPrice;
	
	public void printReceipt(List<Product> cart, Date date) {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String dateString = simpleDateFormat.format(date);

		System.out.println("Date: " + dateString);
		System.out.println("---Products---");

		for (Product product : cart) {
			product.print();
			this.subtotal += product.getPrice();
			this.discountTotal += product.getDiscount();
			this.totalPrice += product.getPrice() - product.getDiscount();
		}
		System.out.println("-----------------------------------------------------------------------------------");

		System.out.println("SUBTOTAL: $" + df.format(this.getSubtotal()));
		System.out.println("DISCOUNT: -$" + df.format(this.getDiscountTotal()));
		System.out.println("TOTAL: $" + df.format(this.getTotalPrice()));
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getDiscountTotal() {
		return discountTotal;
	}

	public void setDiscountTotal(double discountTotal) {
		this.discountTotal = discountTotal;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}

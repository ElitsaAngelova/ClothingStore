package clothingstore;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import clothingstore.models.Product;
import clothingstore.models.Shirt;
import clothingstore.models.Shoes;

public class ClothingStore {

	private static final int TUESDAY = 3;
	
	private List<Product> cart;
	private Date date;
	
	public ClothingStore(List<Product> cart, Date date) {
		this.cart = cart;
		this.date = date;
	}
	
	public void calculateDiscount(Product product) {
		int discount = 0;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if ((cal.get(Calendar.DAY_OF_WEEK) == ClothingStore.TUESDAY) && (product instanceof Shoes)) {
			discount = 25;
		} else if (cart.size() >= 3) {
			discount = 20;
		} else if ((cal.get(Calendar.DAY_OF_WEEK) == ClothingStore.TUESDAY) && (product instanceof Shirt)) {
			discount = 10;
		}
		product.setDiscountPercentage(discount);
		product.setDiscount(round(product.getPrice() * (double) product.getDiscountPercentage() / 100, 2));
	}
	
	public void purchase (List<Product> products) {
		this.setCart(products);
	}
	
	public List<Product> getCart() {
		return cart;
	}
	
	public void setCart(List<Product> cart) {
		this.cart = cart;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	private static double round(double value, int places) {
	    if (places < 0) {
	    	throw new IllegalArgumentException();
	    }

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    
	    return bd.doubleValue();
	}
}

package clothingstore;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import clothingstore.enums.ShirtSize;
import clothingstore.models.IncorrectSizeException;
import clothingstore.models.Jacket;
import clothingstore.models.Product;
import clothingstore.models.Shirt;
import clothingstore.models.Shoes;
import clothingstore.models.Trousers;

public class Main {

	public static void main(String[] args) throws IncorrectSizeException {
		Date date;
		List<Product> cart = new ArrayList<Product>();
		Calendar cal = Calendar.getInstance();
		
//		Example 1: 
		
//		List<Product> productsExample1 = new ArrayList<Product>();
//		cal.set(Calendar.YEAR, 2022);
//		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
//		cal.set(Calendar.DAY_OF_MONTH, 2);
//		cal.set(Calendar.HOUR_OF_DAY, 12);
//		cal.set(Calendar.MINUTE, 34);
//		cal.set(Calendar.SECOND, 56);
//		date = cal.getTime();
//		
//		Product p1Example1 = new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue", ShirtSize.M);
//		Product p2Example1 = new Shirt("White Cotton Shirt", "BrandS", 15.99, "white", ShirtSize.M);
//		Product p3Example1 = new Trousers("Black Cotton Trousers", "BrandT", 29.99, "black", 50);
//		Product p4Example1 = new Shoes("Black Leather Shoes", "BrandS", 59.99, "black", 43);
//		Product p5Example1 = new Jacket("Black Cotton Suit Jacket", "BrandJ", 99.99, "black", 50);
//		
//		productsExample1.add(p1Example1);
//		productsExample1.add(p2Example1);
//		productsExample1.add(p3Example1);
//		productsExample1.add(p4Example1);
//		productsExample1.add(p5Example1);
		
		
//		Example 2: 
		
//		List<Product> productsExample2 = new ArrayList<Product>();
//		
//		cal.set(Calendar.YEAR, 2022);
//		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
//		cal.set(Calendar.DAY_OF_MONTH, 1);
//		cal.set(Calendar.HOUR_OF_DAY, 12);
//		cal.set(Calendar.MINUTE, 34);
//		cal.set(Calendar.SECOND, 56);
//		date = cal.getTime();
//		
//		Product p1Example2 = new Shirt("Black Silk Shirt", "BrandS", 29.99, "black", ShirtSize.L);
//		Product p2Example2 = new Shirt("White Silk Shirt", "BrandS", 29.99, "white", ShirtSize.L);
//		
//		productsExample2.add(p1Example2);
//		productsExample2.add(p2Example2);
		
//		Example 3: 
		
		List<Product> productsExample3 = new ArrayList<Product>();
		
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 34);
		cal.set(Calendar.SECOND, 56);
		date = cal.getTime();
		
		Product p1Example3 = new Trousers("Red Linen Trousers", "BrandT", 49.99, "red", 56);
		Product p2Example3 = new Shoes("Red Suede Shoes", "BrandS", 59.99, "red", 44);
		Product p3Example3 = new Shoes("Black Suede Shoes", "BrandS", 59.99, "black", 44);
		Product p4Example3 = new Jacket("Red Linen Suit Jacket", "BrandJ", 99.99, "red", 56);
		Product p5Example3 = new Shirt("White Linen Shirt", "BrandS", 29.99, "white", ShirtSize.L);
		
		productsExample3.add(p1Example3);
		productsExample3.add(p2Example3);
		productsExample3.add(p3Example3);
		productsExample3.add(p4Example3);
		productsExample3.add(p5Example3);
		

		
		ClothingStore clothingStore = new ClothingStore(cart, date);
		
		//clothingStore.purchase(productsExample1);
		//clothingStore.purchase(productsExample2);
		clothingStore.purchase(productsExample3);
		
		for (Product product : clothingStore.getCart()) {
			clothingStore.calculateDiscount(product);
		}
		
		Cashier cashier = new Cashier();
		cashier.printReceipt(clothingStore.getCart(), clothingStore.getDate());
	

	}

}

package clothingstore.models;

import java.text.DecimalFormat;

public abstract class Product {

	private DecimalFormat df = new DecimalFormat("0.00");
	
	private String name;
	private String brand;
	private double price;
	private String color;
	private double discount;
	private int discountPercentage;
	
	public Product(String name, String brand, double price, String color) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public void calculateDiscount(int discount) {
		setDiscountPercentage(discount);
		setDiscount(getPrice() * (discount / 100));
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public void print() {
		System.out.println(this.getName() + " - " + this.getBrand());
		System.out.println("$" + df.format(this.getPrice()));
		System.out.println("#discount " + this.getDiscountPercentage() + "% -$" + df.format(this.getDiscount())); 
	}
	
}

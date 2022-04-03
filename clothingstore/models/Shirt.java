package clothingstore.models;

import clothingstore.enums.ShirtSize;

public class Shirt extends Product {
	
	private ShirtSize size;

	
	public Shirt(String name, String brand, double price, String color, ShirtSize size) {
		super(name, brand, price, color);
		this.size = size;
	}

	public ShirtSize getSize() {
		return size;
	}

	public void setSize(ShirtSize size) {
		this.size = size;
	}

}

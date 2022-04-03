package clothingstore.models;

public class Jacket extends Product {
	
	private int size;

	public Jacket(String name, String brand, double price, String color, int size) throws IncorrectSizeException {
		super(name, brand, price, color);
		if (((size >= 42 ) && (size <= 66)) && (size % 2 == 0)){
			this.size = size;
		} else {
			throw new IncorrectSizeException();
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


}

package clothingstore.models;

public class Shoes extends Product{

	private int size;

	public Shoes(String name, String brand, double price, String color, int size) throws IncorrectSizeException {
		super(name, brand, price, color);
		if ((size >= 39 ) && (size <= 46)) {
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

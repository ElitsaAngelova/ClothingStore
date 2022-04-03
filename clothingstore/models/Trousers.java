package clothingstore.models;

public class Trousers extends Product{
	
	private int size;
	
	public Trousers(String name, String brand, double price, String color, int size) throws IncorrectSizeException {
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

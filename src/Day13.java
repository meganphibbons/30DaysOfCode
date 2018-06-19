
public class Day13 extends Day13Support {
	private int price;
	
	Day13(String title, String author) {
		super(title, author);
	}
	
	Day13(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	@Override
	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
}

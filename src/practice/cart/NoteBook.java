package practice.cart;

public class NoteBook implements Product {
	private String name;
	private int price;
	private int dc_price;
	
	public NoteBook() {}
	
	
	public NoteBook(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public void discount() {
		dc_price = (int)(price * 0.8);

	}

	@Override
	public void show() {
		System.out.println("상품이름 : " + name);
		System.out.println("할인가격  : " + dc_price);

	}

}

package kosa.cart;

public class NoteBook implements Product {
	private String name;
	private int price;
	private int dc_price;
	
	//디폴트 생성자
	public NoteBook() {}
	
	//생성자
	public NoteBook(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//setter, getter
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

	public int getDc_price() {
		return dc_price;
	}

	public void setDc_price(int dc_price) {
		this.dc_price = dc_price;
	}

	@Override
	public void discount() {
		dc_price = (int)(price * 0.8);
	}

	@Override
	public void show() {
		System.out.println("상품이름 : " + name);
		System.out.println("상품 할인된 가격 : " + dc_price);
	}
}

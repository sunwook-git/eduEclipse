package practice.cart;

public class Phone implements Product {
	private String name;
	private int price;
	private int dc_price;
	private String maker;
	
	public Phone() {}
	
	
	public Phone(String name, int price, String maker) {
		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
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


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	@Override
	public void discount() {
		dc_price = (int)(price * 0.5);

	}

	@Override
	public void show() {
		System.out.println("상품이름 : " + name);
		System.out.println("할인 가격  : " + dc_price);
		System.out.println("브랜드: " + maker);

	}

}

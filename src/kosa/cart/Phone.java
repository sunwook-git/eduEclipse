package kosa.cart;

public class Phone implements Product {
	private String name;
	private int price;
	private int dc_price;
	private String maker;
	
	//����Ʈ ������
	public Phone() {}
	
	
	//������
	public Phone(String name, int price, String maker) {
		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	//setter,getter
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

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public void discount() {
		dc_price = (int)(price * 0.8);
	}

	@Override
	public void show() {
		System.out.println("��ǰ�̸� : " + name);
		System.out.println("��ǰ ���ε� ���� : " + dc_price);
		System.out.println("������ : " + maker);
	}
}

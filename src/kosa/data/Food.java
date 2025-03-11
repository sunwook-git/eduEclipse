package kosa.data;

public class Food {
	private String foodName;
	private int price;
	
	//디폴트 생성자
	public Food() {}

	//생성자
	public Food(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}

	//setter, getter
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("음식이름: " + foodName);
		System.out.println("가격: " +  price);
	}
	
	
}

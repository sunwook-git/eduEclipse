package kosa.data;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private Food food;		//food 객체를 가지고 있어야함(연관관계)
	private int amount;
	private int total;
	
	//디폴트 생성자
	public Order() {}

	//생성자
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
		//생성자를 만들때는 total가격을 알수 없으므로 food와 amount를 생성하고 total은 따로 써준다
		this.total = food.getPrice()*amount;
	}
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	//한개의 주문에 대한가격
	public void show() {
		food.show();
		System.out.println("주문수량: " + amount);
		System.out.println("가격 : " + food.getPrice());
	}
}

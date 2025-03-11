package kosa.data;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private Food food;
	private int amount;
	private LinkedList<Order> queue;
	
	//디폴트 생성자
	public Order() {}

	//생성자
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
	}
	
	//주문요청(큐 자료구조에 order 추가)
	public void addOrder() {
		queue.offer(this);
	}
	
	//주문처리(자료 구조에 있는 주문처리 : 주문된 내용 출력)
	public void finishOrdrer() {
		Order finishOrder = queue.poll();
		
	}
	
	//매출액 총액(주문처리된 메뉴 합계출력)
	
}

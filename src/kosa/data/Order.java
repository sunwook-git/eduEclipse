package kosa.data;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private Food food;
	private int amount;
	private LinkedList<Food> queue;
	
	//����Ʈ ������
	public Order() {}

	//������
	public Order(Food food, int amount, LinkedList<Food> queue) {
		super();
		this.food = food;
		this.amount = amount;
		this.queue = queue;
	}
	
	
	//�ֹ���û(ť �ڷᱸ���� order �߰�)
	public void addOrder() {
		queue.offer(food);
	}
	
	//�ֹ�ó��(�ڷ� ������ �ִ� �ֹ�ó�� : �ֹ��� ���� ���)
	public void finishOrdrer() {
		
	}
	
	//����� �Ѿ�(�ֹ�ó���� �޴� �հ����)
	
}

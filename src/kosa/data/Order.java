package kosa.data;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private Food food;
	private int amount;
	private LinkedList<Order> queue;
	
	//����Ʈ ������
	public Order() {}

	//������
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
	}
	
	//�ֹ���û(ť �ڷᱸ���� order �߰�)
	public void addOrder() {
		queue.offer(this);
	}
	
	//�ֹ�ó��(�ڷ� ������ �ִ� �ֹ�ó�� : �ֹ��� ���� ���)
	public void finishOrdrer() {
		Order finishOrder = queue.poll();
		
	}
	
	//����� �Ѿ�(�ֹ�ó���� �޴� �հ����)
	
}

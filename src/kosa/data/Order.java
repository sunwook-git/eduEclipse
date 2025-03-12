package kosa.data;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private Food food;		//food ��ü�� ������ �־����(��������)
	private int amount;
	private int total;
	
	//����Ʈ ������
	public Order() {}

	//������
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
		//�����ڸ� ���鶧�� total������ �˼� �����Ƿ� food�� amount�� �����ϰ� total�� ���� ���ش�
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

	//�Ѱ��� �ֹ��� ���Ѱ���
	public void show() {
		food.show();
		System.out.println("�ֹ�����: " + amount);
		System.out.println("���� : " + food.getPrice());
	}
}

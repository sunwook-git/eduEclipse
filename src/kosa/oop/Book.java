package kosa.oop;

public class Book {
	//�䱸�м� ����� ������ ���� => �ʵ�	
	//����� ��� => �޼���
	
	//��� ����
	String name;
	int price;
	
	//����Ʈ ������(�Ķ���Ͱ� ���� ��)
	public Book() {}
	
	//������
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//���ε� å�� ��� �޼��� 
	public void printPrice(int discount) {
		System.out.println(name + " ����� ������ " + price + " ���ε� ������ " + discount + "�� �Դϴ�.");		
	}
	
	//å�� ���� �޼��� 
	public int dc() {
		int discount = price - ((price / 100) *  25);
		return discount;
	}	
}

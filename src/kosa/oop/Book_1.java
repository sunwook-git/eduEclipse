package kosa.oop;

public class Book_1 {
	
	//��� ����
	String bookName;
	int price;
	int dc_price;
	
	//����Ʈ ������(�Ķ���Ͱ� ���� ��)
	public Book_1() {}

	//������
	public Book_1(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}
	
	//���ε� ���� å��
	public void discount() {
		if (price >= 30000) {
			dc_price = (int)(price * 0.75);
		} else if(price >= 20000) {
			dc_price = (int)(price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int)(price * 0.85);
		}
	}
	
	//���
	public void printBook() {
		System.out.println(bookName + " ����� ������ " + price + "�� ���ε� ������ " +dc_price+ "�� �Դϴ�.");
	}
}

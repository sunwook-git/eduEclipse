package kosa.oop;

public class BookMain_1 {

	public static void main(String[] args) {
		int total = 0;
		
		//��ü ����
		Book_1 arr[] = {
			new Book_1("JAVA", 30000)	,
			new Book_1("JSP", 20000)	,
			new Book_1("Oracle", 15000)	
		};
		
		for (Book_1 b : arr) {
			b.discount();
			b.printBook();
			total += b.dc_price;
		}
		
		//�� ����
		System.out.println("�� ���� : " + total);
	}
}

package kosa.oop;

public class BookMain {

	public static void main(String[] args) {
		//��ü ����
		Book java = new Book("JAVA", 30000);
		Book jsp = new Book("JSP", 20000);
		Book oracle = new Book("Oracle", 15000);
		
		//�޼��� ȣ��
			java.printPrice(30000);
			jsp.printPrice(20000);
			oracle.printPrice(15000);		
			
			System.out.println("�ѱݾ� : " +  (java.dc() + jsp.dc() + oracle.dc()) + "��");
	}

}

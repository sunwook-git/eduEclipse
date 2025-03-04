package kosa.oop;

public class BookMain {

	public static void main(String[] args) {
		//객체 생성
		Book java = new Book("JAVA", 30000);
		Book jsp = new Book("JSP", 20000);
		Book oracle = new Book("Oracle", 15000);
		
		//메서드 호출
			java.printPrice(30000);
			jsp.printPrice(20000);
			oracle.printPrice(15000);		
			
			System.out.println("총금액 : " +  (java.dc() + jsp.dc() + oracle.dc()) + "원");
	}

}

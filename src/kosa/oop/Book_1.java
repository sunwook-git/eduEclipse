package kosa.oop;

public class Book_1 {
	
	//멤버 변수
	String bookName;
	int price;
	int dc_price;
	
	//디폴트 생성자(파라미터가 없는 것)
	public Book_1() {}

	//생성자
	public Book_1(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}
	
	//할인된 가격 책정
	public void discount() {
		if (price >= 30000) {
			dc_price = (int)(price * 0.75);
		} else if(price >= 20000) {
			dc_price = (int)(price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int)(price * 0.85);
		}
	}
	
	//출력
	public void printBook() {
		System.out.println(bookName + " 교재는 정가는 " + price + "원 할인된 가격은 " +dc_price+ "원 입니다.");
	}
}

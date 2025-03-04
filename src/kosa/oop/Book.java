package kosa.oop;

public class Book {
	//요구분석 공통된 데이터 구조 => 필드	
	//공통된 기능 => 메서드
	
	//멤버 변수
	String name;
	int price;
	
	//디폴트 생성자(파라미터가 없는 것)
	public Book() {}
	
	//생성자
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//할인된 책값 출력 메서드 
	public void printPrice(int discount) {
		System.out.println(name + " 교재는 정가는 " + price + " 할인된 가격은 " + discount + "원 입니다.");		
	}
	
	//책값 할인 메서드 
	public int dc() {
		int discount = price - ((price / 100) *  25);
		return discount;
	}	
}

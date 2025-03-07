package kosa.oop4;

interface A {
	void abc();
}

interface AA {
	BB abc(String name);
}

class BB {
	BB(String name) {
		System.out.println("BB 생성자: " + name);
	}
}

class B {
	void bcd() {
		System.out.println("B 메서드 호출");
	}
}

public class Main2 {

	public static void main(String[] args) {

//	1. 익명내부 클래스
		AA a1 = new AA() {
			
			@Override
			public BB abc(String name) {				
				return new BB(name);
			}
		};
		a1.abc("홍길동");

//	2. 람다식 표현
		AA a2 = (name)  -> new BB(name);
		a2.abc("박길동");
		
		AA a3 = BB::new;		//BB 객체의 생성자를 호출에서 리턴
		a3.abc("김길동");
		
//여기까지는 선택적 학습		
//////////////////////////////////////////////////////////////		
		
		
// 		1. 익명클래스를 이용하여 abc() 오버라이딩 -> b를 생성해서 bcd() 호출하기
//		A a = new A() {
//			
//			@Override
//			public void abc() {
//				B b = new B();
//				b.bcd();
//			}
//		};
//		a.abc();
		
//	 	2. 해당 내용을 람다식
//		A a2 = () -> {
//			B b = new B();
//			b.bcd();
//		};		
//		a2.abc();
		
//		3. 인스턴스 참조 구현 (참조방식)
//			B b = new B();
//			A a3 = b::bcd;	//a3가 bcd 메소드를 참조하겠다
//			a3.abc();           //a3의 abc가  b의 bcd를 참조
	}
}
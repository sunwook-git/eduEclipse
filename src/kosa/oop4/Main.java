package kosa.oop4;

import kosa.oop3.MyThread;

public class Main {

	public static void main(String[] args) {
		// MyType => 익명 클래스로 구현
//		MyType my = new MyType() {
//
//			@Override
//			public void hello() {
//				System.out.println("Hello");
//			}
//		};
//		my.hello();
		
		// 람다식(함수형 프로그램)으로 구현 , 인터페이스안에 추상메서드가 하나만 있을경우 사용가능
		MyType my2 = () -> {
			System.out.println("람다식 형식 입니다.");
		};
		my2.hello();
		
		MyType my3 = () -> System.out.println("람다식 2째 형식");
		my3.hello();
		
		YourType yt = (String message) -> {
			System.out.println("메시지: " + message);
		};
		yt.talk("hello");
		
		YourType yt2 = message -> System.out.println("메시지: " + message);
		yt2.talk("안녕하세요");
		
		//MyNumber의 두값중 큰 값을 리턴해주는 람다식 작성
		MyNumber mn = (num1, num2) -> (num1 > num2) ? num1 : num2; 		
			System.out.println(mn.getMax(20, 30));		
					
		//Runnable -> 람다식으로 표현
		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {				
				
				}
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.start();
		
	}
}

package kosa.api;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		//p1에는 equals메소드가 없다. 따라서 object의 equals를 사용함(equals는 주소값을 출력함)
		if (p1.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		System.out.println(p1);	//object에 있는 toString을 호출
//		String str = new String("abc");
//		System.out.println(str);	//str의 toString 호출
		
// 		println에서는 toString을 안써줘도 자동으로 호출됨(따라서 아래와 같이도 가능)
// 		System.out.println(str);
	}
}

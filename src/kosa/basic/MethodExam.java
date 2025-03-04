package kosa.basic;

public class MethodExam {
	
	//메서드 정의
	//접근 제어자, (static), 리턴형(void), 메서드 이름(파라미터)
	
	public static void printChar(char ch, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
//		printChar('#', 10);
//		printChar('?', 20);
//		printChar('^', 30);
		
		//return값이 있는 경우 아래와 같이 변수로 결과값 받을수 있다.
		int result = add(10, 20);
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + add(20,30));
	}
}

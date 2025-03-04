package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향으로 작성
		// 1~10까지 합
//		int sum = 0;
//		int i = 1;
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10까지 합 : " + sum);
		
		//퀴즈 > 구구단 7단 출력 (내 방식)
//		int dan = 7;
//		int i = 1;
//		while (i <= 9) {
//			int result = dan * i;			
//			System.out.println(dan + " x " + i + " = " + result);
//			i++;
//		}
		
//			int i = 1;
//			while (i <= 9) {
//				System.out.println("7 * "+ i + " = " + (7*i));
//				i++;
//			}
			
			//for문 : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평방향
//			int sum = 0;
//			for (int i = 1; i<=10; i++) {
//				sum += i;
//			}
//			System.out.println("1~10까지 합 : " + sum);	
			
				
			//퀴즈 : 1~100까지 숫자 중 2의 배수와 3의 배수가 아닌 숫자 출력
			
//			for (int i = 1; i <= 100; i++) {
//				if(i%2 == 0 || i%3 ==0) {
//					continue;					
//				}	
//				System.out.print(i + ", ");		//어떤 특정조건을 실행하지 않고 싶을때 continue 사용 
//			}
//			System.out.println();
		
			//do ~ while : 명령문을 1번은 시작 해야하는 경우
			//키보드로 부터 숫자를 입력받아 음수를 입력 받으면 새로 입력 받도록 조치
			//유효한 값을 입력받을 때까지 반복해야 할 경우 사용
			Scanner sc = new Scanner(System.in);
			
//			int n = 0;
//			
//			do {
//				System.out.print("입력: ");
//				n = sc.nextInt();
//			} while (n < 0);
//			System.out.println("입력결과 : " + n);
			
			//퀴즈 > 임의의 난수 3개 받아서 서로 중첩되지 않도록 출력하기
//		int n = (int)(Math.random() * 9) + 1 ;		//random 0~9까지 임의의 숫자 받음
																					//1부터 9까지 숫자를 받아야 되기 떄문에 뒤에 +1 을 해줌
			int a,b,c;			
			
			a = (int)(Math.random() * 9) + 1;
					
			do {
				b = (int)(Math.random() * 9) + 1;				
			} while (a == b);			
						
			do {				
				c = (int)(Math.random() * 9) + 1;
			} while (a == c || b == c);
			
			System.out.println(a + ", " + b + ", " + c);
	}
}

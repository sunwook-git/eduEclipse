package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission08 {

	public static void main(String[] args) {
		// UpDown 게임 구현
		// 난수(정답) 생성 : 1~100 => 1개 난수 생성
		// 키보드로 부터 정수 입력(1~100)  200 => 다시 입력 받게
		// 입력한 숫자와 난수의 비교
		// 정답 => "축하합니다. 3번만에 성공" 프로그램 종료
		// 오답 => Up or Down 출력
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int re = r.nextInt(100) + 1;
		System.out.println(re);
		int n  = 0;
		int count  = 0;
		
		while(true) {
			
			do {
				System.out.print("정수입력 : ");
				n = sc.nextInt();
			} while(n > 100 || n < 1);
				count++;
				
				if (re == n) {
					System.out.println(count + "번째 성공했습니다.");
					break;
				} else if (re < n) {
					System.out.println("DOWN");
				} else if (re > n) {
					System.out.println("UP");
				}
		}
//		int a =(int)(Math.random() * 100)  + 1;			
//		int num;
//		int count = 0;
//		
//		do {
//			System.out.print("정수입력 : ");
//			num = sc.nextInt();			
//			count++;
//			
//			if (num > 100) {
//				continue;
//			}			
//			else if (num < a) {
//				System.out.println("Up");
//			} else if(num > a ) {
//				System.out.println("Down");
//			}			
//		} while (num != a);
//		System.out.println("축하합니다." + count + "번만에 성공");
	}
}



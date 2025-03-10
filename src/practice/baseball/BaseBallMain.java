package practice.baseball;

import java.util.Scanner;

public class BaseBallMain {

	public static void main(String[] args) {
		BaseBall b = new BaseBall();
		Scanner sc = new Scanner(System.in);
		
		//지역변수 초기화
		int strike = 0;
		int ball = 0;
		int count = 0;
		int[] input = new int[3];
		
		do {
			System.out.print("게임도전");
			System.out.print("숫자(3자리) 입력: ");
			for (int i = 0; i < 3; i++) {
				input[i] = sc.nextInt();
			}
			
			strike = b.countStrike(input);
			ball = b.countBall(input);
			System.out.println(strike + "S" + ball + "B");
			count++;
									
		} while (strike != 3);
			System.out.println(count + "번쨰 성공했습니다.");
	}
}

package kosa.mission;

import java.util.Scanner;

public class BaseBallMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
			a = (int)(Math.random() * 3) + 1;

		do {
			b = (int)(Math.random() * 3) + 1;
		} while (a == b);
		
		do {
			c = (int)(Math.random() * 3) + 1;
		} while (a==b | b==c);
		
		int arr[] = {a,b,c};
		System.out.println("정답 : " + arr[0] + arr[1] + arr[2]);
		
		//중복되지 않는 임의의 난수 1~9까지 난수 3자리 구하기 
		
		
		//키보드로 부터 3개의 숫자를 입력 받는다.
		int arr2[] = new int[3];
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("입력 : ");
			arr2[i] = sc.nextInt();
			
			if (arr[0] == arr2[0]) {
				System.out.println("정답");
			} 					
		}
	}
}

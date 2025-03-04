package kosa.mission;

import java.util.Scanner;

public class Condition02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
	}
}

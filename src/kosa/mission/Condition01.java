package kosa.mission;

import java.util.Scanner;

public class Condition01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		if (age > 18) {
			System.out.println("18세를 초과하여 입장이 불가능합니다.");
		}		
	}
}

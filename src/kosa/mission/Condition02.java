package kosa.mission;

import java.util.Scanner;

public class Condition02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�̼����� �Դϴ�.");
		}
	}
}

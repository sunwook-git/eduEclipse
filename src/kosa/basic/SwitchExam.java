package kosa.basic;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.�ܹ��� 2.�ݶ� 3.���� 4.��Ÿ");
		System.out.print("�޴����� : ");		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("�ܹ��� ����");
			break;
		case 2:
			System.out.println("�ݶ� ����");
			break;
		case 3:
			System.out.println("���� ����");
			break;	
		default:
			System.out.println("��Ÿ ����");
			break;
		}
	}
}

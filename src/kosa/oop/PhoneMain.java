package kosa.oop;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Phone[] phonebook = new Phone[10]; 			
		Scanner sc = new Scanner(System.in);
		int count;
		
		while(true) {
			System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.����");
			System.out.print("�޴�: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				int number = Integer.parseInt(sc.nextLine());
				System.out.print("������� : ");
				int date = Integer.parseInt(sc.nextLine());
				System.out.println("��ȭ��ȣ�� ��� �Ǿ����ϴ�.");
				break;

			default:
				break;
			}
			
			
		}
		

	}

}

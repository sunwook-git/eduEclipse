package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner sc  = new Scanner(System.in);		
		Manager m = new Manager();			//��ü���� new�� �����ϸ� �����ڷ� �̵���
			
		
		while(true) {			
			System.out.println("1.�߰� 2.��� 3.�˻� 4.����");
			System.out.print("�޴��Է� : ");
			String menu = DataInput.sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;				
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				System.out.println("���α׷� ����");
				return;
			}
		}
	}
}

package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// �޴��� �����ؼ� �ش� �޴��� ���� ��ɹ��� �������� system.out.println()
		// 4�� �� ������ ������ ��� �ݺ� => 4�� ����� return; �Է��Ͽ� ��������
		// 1.�߰� 2.��� 3.�˻� 4.����
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.�߰� 2.��� 3.�˻� 4.����");
			System.out.print("�޴��� �����ϼ��� : ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("�߰� ����");
				break;
			case 2:
				System.out.println("��� ����");
				break;
			case 3:
				System.out.println("�˻� ����");
				break;
			case 4:
				System.out.println("���α׷� ����");
				return;
			}
		}
	}
}
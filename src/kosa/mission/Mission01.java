package kosa.mission;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		// �̸�, ����, �ּҸ� Ű����� ���� �Է� �޾� ������ �ʱ�ȭ �� ����ϱ�
		// ��°�� > �̸� : ȫ�浿
		//				 ����  : 24
		//	     		 �ּ� : ����� ���ı� ������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();		
		
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
						
		System.out.print("�ּ� : ");
		String address =  sc.nextLine();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
		

	}

}

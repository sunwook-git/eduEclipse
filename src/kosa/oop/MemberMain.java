package kosa.oop;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// ȸ������ ���α׷��� ����
		// ȸ��(�̸�,����), �������
		// ȸ�� ��ü ��� ���
		// private => set/get �޼ҵ� ���
		// �����ڷ� �ʱ�ȭ
		
		Scanner sc = new Scanner(System.in);		
		Member arr[] = new Member[5];
		int count = 0;
		
		while(true) {
			System.out.print("�̸�: ");
			String name = sc.nextLine();
			System.out.print("����: ");
			int age = Integer.parseInt(sc.nextLine());
			
			arr[count++] = new Member(name, age);
			if(count == 3) break;
		}		
				
		//���� for ���� ����Ҽ� ���� (���� �迭�� 5���̱� ������ arr.length�� ����� �� ����. count���� 3���϶� ���߱� ����)
		for (int i = 0; i < count; i++) {
			arr[i].memberInfo();
		}
	}
}

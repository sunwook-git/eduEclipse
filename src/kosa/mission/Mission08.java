package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission08 {

	public static void main(String[] args) {
		// UpDown ���� ����
		// ����(����) ���� : 1~100 => 1�� ���� ����
		// Ű����� ���� ���� �Է�(1~100)  200 => �ٽ� �Է� �ް�
		// �Է��� ���ڿ� ������ ��
		// ���� => "�����մϴ�. 3������ ����" ���α׷� ����
		// ���� => Up or Down ���
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int re = r.nextInt(100) + 1;
		System.out.println(re);
		int n  = 0;
		int count  = 0;
		
		while(true) {
			
			do {
				System.out.print("�����Է� : ");
				n = sc.nextInt();
			} while(n > 100 || n < 1);
				count++;
				
				if (re == n) {
					System.out.println(count + "��° �����߽��ϴ�.");
					break;
				} else if (re < n) {
					System.out.println("DOWN");
				} else if (re > n) {
					System.out.println("UP");
				}
		}
//		int a =(int)(Math.random() * 100)  + 1;			
//		int num;
//		int count = 0;
//		
//		do {
//			System.out.print("�����Է� : ");
//			num = sc.nextInt();			
//			count++;
//			
//			if (num > 100) {
//				continue;
//			}			
//			else if (num < a) {
//				System.out.println("Up");
//			} else if(num > a ) {
//				System.out.println("Down");
//			}			
//		} while (num != a);
//		System.out.println("�����մϴ�." + count + "������ ����");
	}
}



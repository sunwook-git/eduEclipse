package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// while : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : ������������ �ۼ�
		// 1~10���� ��
//		int sum = 0;
//		int i = 1;
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10���� �� : " + sum);
		
		//���� > ������ 7�� ��� (�� ���)
//		int dan = 7;
//		int i = 1;
//		while (i <= 9) {
//			int result = dan * i;			
//			System.out.println(dan + " x " + i + " = " + result);
//			i++;
//		}
		
//			int i = 1;
//			while (i <= 9) {
//				System.out.println("7 * "+ i + " = " + (7*i));
//				i++;
//			}
			
			//for�� : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : �������
//			int sum = 0;
//			for (int i = 1; i<=10; i++) {
//				sum += i;
//			}
//			System.out.println("1~10���� �� : " + sum);	
			
				
			//���� : 1~100���� ���� �� 2�� ����� 3�� ����� �ƴ� ���� ���
			
//			for (int i = 1; i <= 100; i++) {
//				if(i%2 == 0 || i%3 ==0) {
//					continue;					
//				}	
//				System.out.print(i + ", ");		//� Ư�������� �������� �ʰ� ������ continue ��� 
//			}
//			System.out.println();
		
			//do ~ while : ��ɹ��� 1���� ���� �ؾ��ϴ� ���
			//Ű����� ���� ���ڸ� �Է¹޾� ������ �Է� ������ ���� �Է� �޵��� ��ġ
			//��ȿ�� ���� �Է¹��� ������ �ݺ��ؾ� �� ��� ���
			Scanner sc = new Scanner(System.in);
			
//			int n = 0;
//			
//			do {
//				System.out.print("�Է�: ");
//				n = sc.nextInt();
//			} while (n < 0);
//			System.out.println("�Է°�� : " + n);
			
			//���� > ������ ���� 3�� �޾Ƽ� ���� ��ø���� �ʵ��� ����ϱ�
//		int n = (int)(Math.random() * 9) + 1 ;		//random 0~9���� ������ ���� ����
																					//1���� 9���� ���ڸ� �޾ƾ� �Ǳ� ������ �ڿ� +1 �� ����
			int a,b,c;			
			
			a = (int)(Math.random() * 9) + 1;
					
			do {
				b = (int)(Math.random() * 9) + 1;				
			} while (a == b);			
						
			do {				
				c = (int)(Math.random() * 9) + 1;
			} while (a == c || b == c);
			
			System.out.println(a + ", " + b + ", " + c);
	}
}

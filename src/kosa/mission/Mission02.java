package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		//�������� ����
		// ����, ����, ���� ������ Ű����� �Է� �ް�
		// ������ ����� ����ϼ���. (�� ����� �Ǽ���)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();

		System.out.print("���� : ");
		int eng = sc.nextInt();;

		System.out.print("���� : ");
		int math = sc.nextInt();

		int sum = sum(kor, eng, math);
		int aver = average(sum);
		
		//double average = (double)sum / 3;
		//double average = sum / 3.0;
		
		//int sum =  kor + eng + math;
		//int average = (int)(sum / 3.0); 
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + aver);
	}
	
	//������ ���ϴ� �޼���
	public static int sum(int kor, int eng, int math) {
		int sum = kor+eng+math;
		return sum;
	}
	
	//����� ���ϴ� �޼���
	public static int average(int sum) {
		int average = (int)(sum / 3.0);
		return average;
	}
}

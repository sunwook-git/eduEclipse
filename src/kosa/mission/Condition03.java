package kosa.mission;

import java.util.Scanner;

public class Condition03 {
	public static void main(String[] args) {
				
//if ~  else if ����
//����� 90�� �̻��̸� A, 80�� �̻��̸� B, 70�� �̻��̸� C, 60���̻��̸� D, �����ϴ� F 

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();

		System.out.print("���� : ");
		int eng = sc.nextInt();;

		System.out.print("���� : ");
		int math = sc.nextInt();

		int sum =  kor + eng + math;
		//double average = (double)sum / 3;
		//double average = sum / 3.0;
		int average = (int)(sum / 3.0); 
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		
		if (average >=  90) {
			System.out.println("���� : A");
		} else if(average >= 80) {
			System.out.println("���� : B");
		} else if(average >= 70 ) {
			System.out.println("���� : C");
		} else if(average >= 60) {
			System.out.println("���� : D");
		} else {
			System.out.println("���� : F");
		}
	}
}



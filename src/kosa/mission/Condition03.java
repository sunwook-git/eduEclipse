package kosa.mission;

import java.util.Scanner;

public class Condition03 {
	public static void main(String[] args) {
				
//if ~  else if 예제
//평균이 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점이상이면 D, 그이하는 F 

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();;

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum =  kor + eng + math;
		//double average = (double)sum / 3;
		//double average = sum / 3.0;
		int average = (int)(sum / 3.0); 
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		if (average >=  90) {
			System.out.println("학점 : A");
		} else if(average >= 80) {
			System.out.println("학점 : B");
		} else if(average >= 70 ) {
			System.out.println("학점 : C");
		} else if(average >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
	}
}



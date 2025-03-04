package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		//성적관리 구현
		// 국어, 영어, 수학 점수를 키보드로 입력 받고
		// 총점과 평균을 출력하세요. (단 평균은 실수형)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();;

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = sum(kor, eng, math);
		int aver = average(sum);
		
		//double average = (double)sum / 3;
		//double average = sum / 3.0;
		
		//int sum =  kor + eng + math;
		//int average = (int)(sum / 3.0); 
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + aver);
	}
	
	//총점을 구하는 메서드
	public static int sum(int kor, int eng, int math) {
		int sum = kor+eng+math;
		return sum;
	}
	
	//평균을 구하는 메서드
	public static int average(int sum) {
		int average = (int)(sum / 3.0);
		return average;
	}
}

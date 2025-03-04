package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		// 국어,영어,수학 => 키보드로 입력 받아 배열로 구현해보자
		// 평균 => 메서드 정의 구현
		// 배열의 크기는 5개
		Scanner sc = new Scanner(System.in);		

		String subject[] = {"국어", "영어", "수학"};
		int arr[] = new int[5];
		
		for (int i = 0; i < 3; i++) {
			System.out.print(subject[i] + "입력: ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];		//총점
		}
		average(arr);
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for (int n : arr) {
			System.out.print(n + "\t");
		}
	}
		
	public static void average (int arr[]) {
		arr[4] = arr[3]/3; 	
	}
}

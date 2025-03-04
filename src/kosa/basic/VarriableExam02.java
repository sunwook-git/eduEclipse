package kosa.basic;

import java.util.Scanner;

public class VarriableExam02 {

	public static void main(String[] args) {
// 키보드로 부터 데이터 입력
//		System.out.println("첫번쨰");	//println : 한줄 개행
//		System.out.println("두번쨰");
//		
//		System.out.print("1, ");			//개형하지 않고 옆으로 찍음
//		System.out.print("2");
//		System.out.println();
//		System.out.println("3");
			
			Scanner sc = new Scanner(System.in);	//Sc + space : import 자동생성
			
			System.out.print("정수 입력: ");		
			int num = Integer.parseInt(sc.nextLine());	// 문자열 -> 정수형으로 변환
//			int num = sc.nextInt();
//			sc.nextLine(); 
			
			System.out.print("문자 입력: ");
			String str = sc.nextLine();		//키보드로 부터 문자열 입력받음
			
			System.out.println(num);
			System.out.println(str);
	}

}

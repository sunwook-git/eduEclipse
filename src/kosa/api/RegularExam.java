package kosa.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print	("입력: ");
		String str = sc.nextLine();
		
		//abc 문자를 포함 여부 체크(앞이든 뒤든 abc가 있는지 체크)
//		if (str.matches(".*abc.*")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}

		//숫자만 3자리 유무 판단 
		//원래는 \d 인데 자바에서는 문법적의미를 가지고 있어서 \\d로 해야함
//		if (str.matches("[\\d]{3}")) {
//			System.out.println("3자리 입니다");
//		} else {
//			System.out.println("3자리가 아닙니다.");
//		}
		
		//알파벳, 숫자만 5자리 이상
//		if (str.matches("[\\w]{5,}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
		//한글만 3~5자리
//		if (str.matches("[가-힣]{3,5}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
		//퀴즈
		//dolsam77@nate.com ⇒ 매칭
		//432dolsam77@nate.com ⇒ 비매칭 (숫자로 시작하면 오류)
		//dolsam77nate.com ⇒ 비매칭(@가 없으면 오류)
		//dolsam77@nate.comcom ⇒ 비매칭(com이 2개 이상일 경우 오류)
		
		//dolsam :  ^[\\D]  => 숫자를 제외한 모든 문자로 시작
		// 77 : \\w => 알파벳이나 숫자
		// @ :  @
		// nate  :  \\w => 알파벳이나 숫자
		// .  =>  \\.  
		// com : \\w{2,3}$  =>  2~3자리의 알파벳이나 숫자로 끝남
		if (str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) {			
			System.out.println("매칭");
		} else {
			System.out.println("비매칭");
		}	
	}
}
	
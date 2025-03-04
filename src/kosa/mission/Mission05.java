package kosa.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		//문자열 비교 : 문자열.equals("문자열")
//		String a = "aaa";
//		String b = "bbb";
//
//		if (a.equals(b)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("틀리다");
//		}
		
		//두 정수와 연산자 문자열을 입력 받습니다.
		//사칙연산 계산기를 만들어 보자.
		// ex > 정수1 : 50
		//		   정수2 : 20
		//		   연산자 : +
		//           결과> 70
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(sc.nextLine());		
		
		System.out.print("연산자 : ");
		String cl = sc.nextLine();
		
		double result = 0;
		
		switch (cl) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / (double)num2;
			break;	
		}
		//System.out.println("결과> " + result);
		//System.out.printf("결과> %.2f", result);		//소숫점 2째자리 까지 출력
		DecimalFormat df = new DecimalFormat("#.##");		// DecimalFormat api를 사용하여 소숫점 출력 
		System.out.println("결과> " + df.format(result));
		
//		if (cl.equals("+")) {
//			result = num1 + num2;
//		} else if (cl.equals("-")) {
//			result = num1 + num2;
//		} else if (cl.equals("*")) {
//			result = num1 * num2;
//		} else if (cl.equals("/")) {
//			result = num1 / (double)num2;
//		}
//		System.out.println("결과> " + result);
	}
}

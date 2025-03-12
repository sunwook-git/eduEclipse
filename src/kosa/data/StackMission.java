package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 과제1 키보드로부터 수학 수식을 입력
		// ((2+3)+10) => 괄로 일치 / 불일치 판단
		// 스택에 큐를 저장하여 비교
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		
		System.out.print("수식입력: ");
		String str = sc.nextLine();		// ((2+3)+10) 입력
		
		//예외 발생할수 있으므로 try catch사용
		try {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				
				if (ch == '(') {
					stack.push(ch+"");	// ch+"" : ch형을 String으로 변환
				} else if (ch == ')') {
					stack.pop();		//제일 최근에 들어온 것부터 빠진다, 괄호가 부족하면 예외발생
				}
			}
			if (stack.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 불일치 합니다.");
			}
			
		} catch (Exception e) {
			System.out.println("괄호가 불일치 합니다.");
		}
		
		//과제2 Phone의 manager의 private PhoneInfo arr[]; 를 List로 변경

		//과제3 식당 주문관리 프로그램(큐 구조)
//		1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료
//
//		입력 1>Food(foodName, price)
//		          Order(Food, amount)생성 => 자료구조 추가
//		-> food객체 new로 2개정도 생성
//		-> 주문요청 new order
//		      - Food
//			  - amount	  
//		-> 큐 자료구조에 order추가 
//
//		입력 2> 자료구조에 있는 주문처리(주문된 내용 출력)
//
//		입력 3> 주문처리된 메뉴에 대한 합계출력
		
	}

}

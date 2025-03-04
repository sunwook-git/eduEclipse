package kosa.oop;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// 회원가입 프로그램을 구현
		// 회원(이름,나이), 정보출력
		// 회원 전체 목록 출력
		// private => set/get 메소드 사용
		// 생성자로 초기화
		
		Scanner sc = new Scanner(System.in);		
		Member arr[] = new Member[5];
		int count = 0;
		
		while(true) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("나이: ");
			int age = Integer.parseInt(sc.nextLine());
			
			arr[count++] = new Member(name, age);
			if(count == 3) break;
		}		
				
		//향상된 for 문을 사용할수 없다 (현재 배열은 5개이기 때문에 arr.length를 사용할 수 없다. count에서 3개일때 멈추기 때문)
		for (int i = 0; i < count; i++) {
			arr[i].memberInfo();
		}
	}
}

package kosa.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		//배열 사용 방법
		//1. 배열에 사용될 데이터 타입 결정
		//2. 배열의 크기를 결정 => 크기 다를시 ArrayIndexOutofBoundsException 예외 발생
		//3. 배열 생성 방법 선택 => 1(선언, 생성분리), 2(선언과 생성함게), 3(선언, 생성, 초기화까지)
		//4. 배열을 어떻게 초기화 => 직접 인덱스 접근, for문, 3번 방법
		//5. 배열의 데이터를 어떻게 출력 => 직접 인덱스 접근, for문, 향상된 for문
		
		//퀴즈> 키보드로 부터 문자열을 입력 받아 배열에 추가한 후 전체를 출력하자.
		//"q"를 입력할때까지 계속해서 입력 받아 배열에 추가하도록 한다.
		// ex> 입력 : 홍길동
		//         입력 : 김길동
		//         입력 : q
		//         출력> 홍길동, 김길동
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];		//크기 5의 배열 선언
		int index = 0;
		
		
		while (true) {
			System.out.print("입력 : " );
			String name = sc.nextLine();
			
			// "q" 입력 시 반복문 종료
			if (name.equals("q")) {
				break;
			}	
			
			//배열이 꽉 차지 않았을 때만 추가
			if (index < arr.length) {
				arr[index] = name;
				index++;
			} else {
				System.out.println("배열이 꽉 찼습니다.");
				break;
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.println("출력> " + arr[i]);
		}		
		sc.close();
	}
}

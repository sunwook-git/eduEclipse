package kosa.basic;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. 배열 선언, 생성 분리
		int arr[];					//배열 선언(배열변수 : 주소값), 생성된 배열의 주소값을 담기 위해
		arr = new int[5];	//배열생성(메모리 할당)
		System.out.println(arr);
		
		// 2. 배열 선언, 생성 함께
		int arr2[] = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		System.out.println(arr2[0] + ", " + arr2[1]);
		
		// 3. 배열 선언, 생성, 초기화 함께
		int arr3[] = {1,2,3,4,5};		
		
		//배열에 있는 내용 출력 => for 초기식:0, 배열크기 -1
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3["+i+"]=" + arr3[i]);
		}
		
		//향상된 for문
		for (int n : arr3) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
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
		
		
	}

}

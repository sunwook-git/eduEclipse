package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수는 데이터를 담는 그릇, 데이터 종류 다양 ex) 홍길동, 100, 3.14, true
		// 기본형 데이터 타입(primitive type)
		//byte, short, int, long => 정수형
		// float, double => 실수형
		// char => 문자형(문자1개)
		//boolean => 논리형
		//String => 문자열 (Object Type)
		
		int num; //변수 선언 (4byte 공간 메모리 할당)
		int arr[]; //배열 선언(Object Type : 래퍼런스 타입)
						//참조형(메모리에 있는 주소값을 가지고 있기때문에 참조가능)
						//arr[] 변수는 데이터 값을 가지고 있지 않지만 메모리에 있는 주소값을 있기때문에 참조할수 있으므로 데이터 값을 가져와서사용가능 
		
		num = 100;	//변수 초기화
		int num2 = 10;	//메서드 안에 선언된 변수 , 로컬변수(지역변수) => 반드시 초기화 후 사용
		System.out.println(num2);  //	num2 변수를 초기화 하지 않았기 때문에 오류남
		
		int num3 = 200;	//변수 선언 및 초기화
		System.out.println("숫자: " + num3);
		
		//변수 선언시 유의사항
		//변수명 : 특수문자x, 숫자로 시작x, 예약어x, 소문자로 표현(카멜표기법)
		// 기본 리터럴 : ""(String), true(boolean), 10(int), 3.14(double) => default 
		
		// float num4 = 3.14;	//double형이 아닌 float을 사용하여서 에러남
		float num5 = 3.14f;	//f를 붙이므로서 형변환 되어 사용가능
		
		// casting(형변환) : 기준
		// byte < short < int < long < float < double < String
		// int <==> char
		double  b =3.14;
		int c = (int)b;	//강제 형변환
		System.out.println(c);	//데이터 손실 발생
		
		double e = c;		//암묵적 형변환
		System.out.println(e);
		
		long num6 = 100L;	//기본 리터럴을 Long으로 바꿈
		
		int num7 = 010;	//앞에 숫자0이 들어갈 시 8진수로 인식
		System.out.println(num7);
	}

}

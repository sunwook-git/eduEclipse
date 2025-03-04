package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		
		int num; 	// 변수 선언이 if안에 들어가 있으면 에러남
		if (1 == 1) {
			num = 100;
		}
		System.out.println(num);
		
		//형변환(암묵적, 강제)
		//int <==> char
		char ch = 'A';		
		System.out.println((int)ch);
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		//int(기본형) < ==> String(Object)
		//String num3 = "100안녕";	  		// 숫자가 아닌 값이 Integr로 형변환을 시도 했을 떄 나타나는 에러 
		String num3 = "100";
		int num4 = Integer.parseInt(num3);
		int result = num4 + 100;
		System.out.println(result);
		
		int num5  = 10;
		String num6 = String.valueOf(num5);		//"10"
		String num7 = num5 + "";		//"10"
		
		String str = 7 + "7" + 7;		//String 타입은 어떤것과 연산하여도 String이 된다.
		System.out.println(str);
		
		boolean bool = true;
		
		// %연산자 : 나머지 연산자
		System.out.println((10%3));
		
		//2의 배수이거나 3의 배수가 아닌 숫자를 출력
		for (int i = 1; i <= 100;  i++) {
			if (!(i%2 == 0) | (i%3==0) ) {
				System.out.print(i + ", ");
			}
		}
		
		//복합대입 연산자
		System.out.println();
		int n = 0;
		n+=1;
		System.out.println(n);
		
		//
		int x = 10;
		int y = 0;
		
		y = ++x;	//후치 증감, 전치 증감
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		//삼항 연산자
		int b = 40;
		int c = 20;
		
		int max = (b>c) ? b: c;
		System.out.println(max);
	}

}

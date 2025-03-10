package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		String str = "ABC";
		String str2 = "ABC";	//"ABC"라는 문자열을 가지고 있는 str이 이미 있기때문에 해당 주소를 참조함
		String str3 = new String("ABC");
		
		if (str == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		//2. String 클래스는 불변성의 특징 => StringBuffer, StringBuilder(가변성)
		String str4 = str.concat("DEF");	//str자기 자신은 바뀌지 않는다, 다반 리턴값으로는 받을수 있다
		System.out.println(str4);
		
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("def");
		System.out.println(sb);
		
		//연산자로 변경가능
		String sql = "select * from board ";
		int num = 10;
		
		if (num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		//해당 문자열의 위치를 파악 : indexOf("문자열") => 있으면 인덱스, 없으면 : -1 
		System.out.println(sql.indexOf("from"));
		
		//문자열의 길이(전체)
		System.out.println(sql.length());
		
		//한 개의 문자를 출력(charAt)
		for (int i = 0; i < sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();
		
		//문자열 부분추출 : subString(5), subString(5,10) -> 5부터 10전까지 
		//sql 변수 "board" 만 문자열 추출
		
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		//퀴즈
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
		
		//head = (fileName.substring(fileName.indexOf("kosa"), fileName.indexOf("kosa")+5));
		//pattern = (fileName.substring(fileName.indexOf("jpg"), fileName.indexOf("jpg")+3));
		head = fileName.substring(0, fileName.indexOf("."));	//	. 전까지 출력이므로 kosa출력됨 
		pattern = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(head+ " : " + pattern);
		
		if (fileName.endsWith("jpg")) {
			System.out.println("이미지파일 입니다");
		}
		
		String id = "kosa";
		String m_id = "Kosa";
		//m_id = m_id.toLowerCase();
		
//		if (id.equals(m_id)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
		
//		if (id.equalsIgnoreCase(m_id)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
		
		//trim : 공백제거
		if (id.equals(m_id.trim())) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		//문자열 => String[] 변환
		//"사과,포도수박,배"
		String fruits = "사과,포도,수박,배";
		String arr[] = fruits.split(",");	//,를 기준으로 문자열을 배열로 저장
		System.out.println(Arrays.toString(arr));
		
		//문자열 => char[]
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//문자열 => byte[] 변환
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes();
		System.out.println(Arrays.toString(arr3));
		
		//문자열 => 정수형
		String str7 = "100";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);
		
		//정수형 => 문자열
		int num3 = 10;
		String str8 = String.valueOf(num3);
		String str9 = 10 + "";
		System.out.println(str8);
		System.out.println(str9);
	}
}

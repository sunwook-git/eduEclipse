package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExam {

	public static void main(String[] args) {
		
		//1. 날짜표현(Calendar)
		Calendar gc = Calendar.getInstance();
		gc.add(Calendar.DATE,100);
		//System.out.println(gc);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str = sdf.format(gc.getTime());	//getTime : Calendar  객체인 gc를 Date객체로 변환
		System.out.println(str);
		
		//2. 날짜표현(Date)
		Date now = new Date();
		String str2 = now.toString();
		System.out.println(str2);
		
		//3. 키보드 => 날짜 입력 2025/03/10(문자열) => Date 객체 변환
		DateFormat df= new SimpleDateFormat("yyyy/MM/dd");
		Scanner sc = new Scanner(System.in);
		Date date = null;
		try {
			System.out.print("날짜 입력 : ");
			String str3 = sc.nextLine();
			date = df.parse(str3); 		//str3 문자열 파싱하여 date객체로 변환
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("str3 = " + date);
		
		String str4 = sdf.format(date);		//Date => 문자열 변환
		System.out.println("str4 = " + str4);
		
	}
}

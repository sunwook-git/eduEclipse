package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam2 {

	public static void main(String[] args) {
//		String data[] = {
//				"bat", "bba", "bbg", "bonus",
//				"CA", "ca", "c232", "car",
//				"date", "dic", "diraaa"
//		};
		
		//static �޼ҵ��̱� ������ Ŭ���� �̸�.�޼ҵ�� ǥ��
//		Pattern p = Pattern.compile("c[a-z]*");
//		Pattern p2 = Pattern.compile("^[A-Z]*$");
		
		//���� ǥ���İ� ��Ī�Ǵ��� for������ ����
//		for (int i = 0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if (m.matches()) {
//				System.out.println(data[i]);
//			}
		
//		for (int i = 0; i < data.length; i++) {
//			Matcher m = p2.matcher(data[i]);
//			if (m.matches()) {
//				System.out.println(data[i]);
//			}
//		}
		
//		String source = "ab?cd?ef?gh";
//		String reg = "(\\w*)";
//		
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(source);
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
		String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}

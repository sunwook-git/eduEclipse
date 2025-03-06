package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner sc  = new Scanner(System.in);		
		Manager m = new Manager();			//객체에서 new를 생성하면 생성자로 이동함
		Company cp = new Company();
		
		while(true) {			
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.print("메뉴입력 : ");
			String menu = DataInput.sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;				
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}

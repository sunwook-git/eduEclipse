package kosa.oop;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Phone[] phonebook = new Phone[10]; 			
		Scanner sc = new Scanner(System.in);
		int count;
		
		while(true) {
			System.out.println("1.추가 2.전체출력 3.검색 4.종료");
			System.out.print("메뉴: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				int number = Integer.parseInt(sc.nextLine());
				System.out.print("생년월일 : ");
				int date = Integer.parseInt(sc.nextLine());
				System.out.println("전화번호가 등록 되었습니다.");
				break;

			default:
				break;
			}
			
			
		}
		

	}

}

package kosa.phone;

import java.util.Scanner;

public class Manager {
	//전화번호 목록을 관리하는 기능(추가, 출력, 검색 등등)
	
	//여러개의 PhoneInfo 객체를 관리하기 위하여 배열사용 (Manager 객체를 생성할�� 메모리 올라옴)
	private PhoneInfo arr[];
	private int count;
	//private Scanner sc;
	
	
	//기본 생성자 : 매개변수를 받을 필요 없으므로 기본 생성자에서 
	public Manager() {
		arr = new PhoneInfo[10];
		//sc = new Scanner(System.in);
	}
	
	//전화번호 추가
	public void addPhoneInfo() {
		//1.전체 2.동창 3.직장
		System.out.println("1.일반 2.동창 3.직장");
		System.out.print("메뉴선택 : ");
		String menu = DataInput.sc.nextLine();
		
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();
		
		switch (menu) {
		case "1":
			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			break;
		case "2":
			System.out.print("전공 : ");
			String major = DataInput.sc.nextLine();
			System.out.print("학년 : ");
			String year = DataInput.sc.nextLine();
			
			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			break;
		case "3":						
			System.out.print("부서 : ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직급 : ");
			String position = DataInput.sc.nextLine();
			
			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			break;
		}
		
		//메세지 출력
		System.out.println("전화번호가 등록 되었습니다.");
	}
	
	//전체 목록 출력(phoneinfo에서 한 객체에 대한 내용 출력을 하는 show메서드를 가져와서 전체목록을 출력)
	public void listPhoneInfo() {
		//1.전체 2.동창 3.직장
		System.out.println("1.일반 2.동창 3.직장");
		System.out.print("메뉴 선택: ");
		String choise = DataInput.sc.nextLine();		
		
			switch (choise) {
			case "1":
					System.out.println("**전체목록**");	
					for (int i = 0; i < count; i++) {
						arr[i].show();
					}								
					break;
			case "2":
					System.out.println("**동창목록**");
					for (int i = 0; i < count; i++) {
						if (arr[i] instanceof Universe) {
							arr[i].show();
						}	
					}					
					break;
			case "3":
					System.out.println("**직장목록**");
					for (int i = 0; i < count; i++) {
						if (arr[i] instanceof Company) {	//arr[i]가 
							arr[i].show();	
					}			
				}
					break;		
			}
		}

	// 검색하고자 하는 이름으로 1개의 PhoneInfo 객체의 내용을 출력(찾지 못하였으면 찾지 못했다는 메세지 출력)
	public void searchPhoneInfo() {
		System.out.print("이름 검색 : ");
		String target = DataInput.sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < count; i++) {
			if (target.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
			} 
		}
		
		if (idx == -1) {
			System.out.println("Not Found");
		}
	}
	
}


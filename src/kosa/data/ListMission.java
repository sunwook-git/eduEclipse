package kosa.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로 부터 문자열을 입력받아 처리하자
		// 1.데이터추가 2.데이터 삭제 3.데이터출력(for,Iterator) 4. 종료
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		while (true) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
			System.out.print("메뉴 : ");
			String menu = sc.nextLine();
			int idx = -1;
			
			switch (menu) {
			case "1":
				System.out.print("추가: ");
				list.add(sc.nextLine());		//사과 포도 수박						
				break;
			case "2":
				System.out.print("삭제: ");
				idx = list.indexOf(sc.nextLine());	//포도 입력시 indexOf로 인해 값1이 나옴
				if (idx != -1) {
					list.remove(idx);
				} else {
					System.out.println("존재하지 않습니다.");
				}				
				break;
			case "3":				
//				for (int i = 0; i < list.size(); i++) {					
//					System.out.print(list.get(i) + ", ");
//				}
				Iterator<String> iter = list.iterator();
				while(iter.hasNext()) {					
					System.out.print(iter.next() +", ");
				}
				break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				return;	
			}
		}
	}
}

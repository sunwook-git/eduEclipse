package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Food food = new Food("짜장면", 30000);
		Food food2 = new Food("짬뽕", 50000);
		
		//Order order = new Order("면", "3개", );
		
		System.out.print("1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료");
		System.out.println("메뉴입력: ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			
			break;
		case "2":
			
			break;
		case "3":
	
			break;
		case "4":
	
			break;		
		}
		
		LinkedList<Food> queue = new LinkedList<Food>();
//		queue.offer(order);		
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}

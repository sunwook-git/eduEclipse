package kosa.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int totalSales = 0;
	
	public static void main(String[] args) {
		LinkedList<Order> list= new LinkedList<Order>();
			
			while(true) {				
				System.out.println("1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료");
				System.out.print("메뉴입력: ");
				String menu = sc.nextLine();
			
			switch (menu) {			
			case "1":				
				addOrder(list);
				break;
			case "2":
				orderService(list);
				break;
			case "3":
				System.out.println("전체 매출액: " + totalSales);
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;		
			}
		}
	}
	
	//주문요청(큐 자료구조에 order 추가)
	public static void addOrder(LinkedList<Order> list) {
		System.out.print("요리명: ");
		String foodName = sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("수량: ");
		int amount = Integer.parseInt(sc.nextLine());
		
		//Food food = new Food(foodName, price);
		//Order order= new Order(food, amount);
		//list.offer(order);
		// 위 3줄을 아래와 같이 쓸수 있음
		list.offer(new Order(new Food(foodName, price), amount));
	}
	
	//주문처리(자료 구조에 있는 주문처리 : 주문된 내용 출력) -> 큐 자료구조를 사용한 이유 처음들어간 순서부터 출력하기 위해
	public static void orderService(LinkedList<Order> list) {
		if (!list.isEmpty()) {
			Order order = list.poll();		//List 에서 빼내기 위해 poll 사용
			order.show();
			totalSales += order.getTotal();
		}
	}
}


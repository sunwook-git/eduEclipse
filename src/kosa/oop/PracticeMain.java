package kosa.oop;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Practice arr[] = new Practice[10];
		int count = 0;
		
		while (true) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int age = Integer.parseInt(sc.nextLine());
			
			arr[count++] = new Practice(name, age);
			if(count == 3) break;
		}
		
		for (int i = 0; i < count; i++) {
			arr[i].memberInfo();
		}
	}
}
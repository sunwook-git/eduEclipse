package kosa.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		//���ڿ� �� : ���ڿ�.equals("���ڿ�")
//		String a = "aaa";
//		String b = "bbb";
//
//		if (a.equals(b)) {
//			System.out.println("����");
//		} else {
//			System.out.println("Ʋ����");
//		}
		
		//�� ������ ������ ���ڿ��� �Է� �޽��ϴ�.
		//��Ģ���� ���⸦ ����� ����.
		// ex > ����1 : 50
		//		   ����2 : 20
		//		   ������ : +
		//           ���> 70
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("����2 : ");
		int num2 = Integer.parseInt(sc.nextLine());		
		
		System.out.print("������ : ");
		String cl = sc.nextLine();
		
		double result = 0;
		
		switch (cl) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / (double)num2;
			break;	
		}
		//System.out.println("���> " + result);
		//System.out.printf("���> %.2f", result);		//�Ҽ��� 2°�ڸ� ���� ���
		DecimalFormat df = new DecimalFormat("#.##");		// DecimalFormat api�� ����Ͽ� �Ҽ��� ��� 
		System.out.println("���> " + df.format(result));
		
//		if (cl.equals("+")) {
//			result = num1 + num2;
//		} else if (cl.equals("-")) {
//			result = num1 + num2;
//		} else if (cl.equals("*")) {
//			result = num1 * num2;
//		} else if (cl.equals("/")) {
//			result = num1 / (double)num2;
//		}
//		System.out.println("���> " + result);
	}
}

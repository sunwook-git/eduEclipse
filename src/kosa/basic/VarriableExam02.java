package kosa.basic;

import java.util.Scanner;

public class VarriableExam02 {

	public static void main(String[] args) {
// Ű����� ���� ������ �Է�
//		System.out.println("ù����");	//println : ���� ����
//		System.out.println("�ι���");
//		
//		System.out.print("1, ");			//�������� �ʰ� ������ ����
//		System.out.print("2");
//		System.out.println();
//		System.out.println("3");
			
			Scanner sc = new Scanner(System.in);	//Sc + space : import �ڵ�����
			
			System.out.print("���� �Է�: ");		
			int num = Integer.parseInt(sc.nextLine());	// ���ڿ� -> ���������� ��ȯ
//			int num = sc.nextInt();
//			sc.nextLine(); 
			
			System.out.print("���� �Է�: ");
			String str = sc.nextLine();		//Ű����� ���� ���ڿ� �Է¹���
			
			System.out.println(num);
			System.out.println(str);
	}

}

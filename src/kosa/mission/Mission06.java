package kosa.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		//�迭 ��� ���
		//1. �迭�� ���� ������ Ÿ�� ����
		//2. �迭�� ũ�⸦ ���� => ũ�� �ٸ��� ArrayIndexOutofBoundsException ���� �߻�
		//3. �迭 ���� ��� ���� => 1(����, �����и�), 2(����� �����԰�), 3(����, ����, �ʱ�ȭ����)
		//4. �迭�� ��� �ʱ�ȭ => ���� �ε��� ����, for��, 3�� ���
		//5. �迭�� �����͸� ��� ��� => ���� �ε��� ����, for��, ���� for��
		
		//����> Ű����� ���� ���ڿ��� �Է� �޾� �迭�� �߰��� �� ��ü�� �������.
		//"q"�� �Է��Ҷ����� ����ؼ� �Է� �޾� �迭�� �߰��ϵ��� �Ѵ�.
		// ex> �Է� : ȫ�浿
		//         �Է� : ��浿
		//         �Է� : q
		//         ���> ȫ�浿, ��浿
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];		//ũ�� 5�� �迭 ����
		int index = 0;
		
		
		while (true) {
			System.out.print("�Է� : " );
			String name = sc.nextLine();
			
			// "q" �Է� �� �ݺ��� ����
			if (name.equals("q")) {
				break;
			}	
			
			//�迭�� �� ���� �ʾ��� ���� �߰�
			if (index < arr.length) {
				arr[index] = name;
				index++;
			} else {
				System.out.println("�迭�� �� á���ϴ�.");
				break;
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.println("���> " + arr[i]);
		}		
		sc.close();
	}
}

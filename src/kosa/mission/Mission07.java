package kosa.mission;

import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// �α��� ������ ������ ����.
		// id, pass Ű����� ���� �Է�
		//���� m_id, m_pass �����ġ�ϸ� => �α��� ����
		//id�� ����ġ => �ش� ���̵� �������� �ʽ��ϴ�.
		//pass ����ġ => ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		
		//String m_id = "kosa";
		//String m_pass = "1234";
		Scanner sc  = new Scanner(System.in);
		
			System.out.print("id : ");
			String m_id = sc.nextLine();
				
		if (!m_id.equals("kosa")) {
			System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("pass: ");
			String m_pass = sc.nextLine();
			
			if (m_pass.equals("1234")) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}		
	}
}

package kosa.phone;

import java.util.Scanner;

public class Manager {
	//��ȭ��ȣ ����� �����ϴ� ���(�߰�, ���, �˻� ���)
	
	//�������� PhoneInfo ��ü�� �����ϱ� ���Ͽ� �迭��� (Manager ��ü�� �����ҋ� �޸� �ö��)
	private PhoneInfo arr[];
	private int count;
	//private Scanner sc;
	
	
	//�⺻ ������ : 
	public Manager() {
		arr = new PhoneInfo[10];
		//sc = new Scanner(System.in);
	}
	
	//��ȭ��ȣ �߰�
	public void addPhoneInfo() {
		System.out.print("�̸� : ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("������� : ");
		String birth = DataInput.sc.nextLine();
		
		//������ PhoneInfo�� �迭�� ����(��ü�� �����ϸ� �����ڷ� �̵� - PhoneInfo�� �����ڷ� �̵�)
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
		
		//�޼��� ���
		System.out.println("��ȭ��ȣ�� ��� �Ǿ����ϴ�.");
	}
	
	//��ü ��� ���(phoneinfo���� �� ��ü�� ���� ���� ����� �ϴ� show�޼��带 �����ͼ� ��ü����� ���
	public void listPhoneInfo() {
		System.out.println("**��ü���**");
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}
	
	// �˻��ϰ��� �ϴ� �̸����� 1���� PhoneInfo ��ü�� ������ ���(ã�� ���Ͽ����� ã�� ���ߴٴ� �޼��� ���)
	public void searchPhoneInfo() {
		System.out.print("�̸� �˻� : ");
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
	
	public void delPhoneInfo() {
		
	}
}


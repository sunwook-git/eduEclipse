package kosa.practice;

public class Manager {

	//��ȭ��ȣ ����� �����ϴ� ���
	//�������� PhoneInfo ��ü�� �����ϱ� ���� �迭���
	private PhoneInfo arr[];
	private int count;
	
	//�⺻ ������
	public Manager() {
		arr = new PhoneInfo[10];
	}
	
	//��ȣ��ȣ �߰�
	public void addPhoneInfo() {
		System.out.print("�̸� : ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("������� : ");
		String birth = DataInput.sc.nextLine();
		
	}
	
	
}

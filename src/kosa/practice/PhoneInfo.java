package kosa.practice;

public class PhoneInfo {

	//�� �� ���� ��ȭ��ȣ�� 
	
	//�ŰԺ��� �ۼ�
	private String name;
	private String phoneNo;
	private String birth;
	
	//�⺻ ������
	public PhoneInfo() {}

	//������
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	//setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	//�� ��ü�� ���� ���� ���
	public void show() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNo);
		System.out.println("������� : " + birth);
	}
	
	
	
}

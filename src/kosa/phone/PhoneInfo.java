package kosa.phone;

import java.io.Serializable;

//��ü ����ȭ �ϱ����� Serializable  implements ���ش�
public class PhoneInfo implements Serializable {
	//�Ű� ���� �ۼ�
		private String name;
		private String phoneNo;
		private String birth;
		
		
		//�⺻ ������(�ʱ�ȭ x), ��������� ��� ��ü�� dafault�� ������ �ϸ� �ʱ�ȭ���� �ʾƵ� ����Ʈ ���� �����Ѵ�.
		public PhoneInfo() {}

		//������(��ü �ʱ�ȭ)
		public PhoneInfo(String name, String phoneNo, String birth) {
			super();
			//ex) this�� �ڱ� �ڽ��� ��ü�� �ʵ带 ��Ÿ�� 
			this.name = name;
			this.phoneNo = phoneNo;
			this.birth = birth;
		}

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
		public void  show() {
			System.out.println("�̸� : " + name);
			System.out.println("��ȭ��ȣ : " + phoneNo);
			System.out.println("������� : " + birth);			
		}
		
		//�޼���
		//class���� �޼���� �ڱ� �� ��ü������ �ڽ��� �ʵ带 �����ϰų� ����ϱ� ���ؼ� ���.
		// PhoneInfo Ŭ����: �� ���� ����ó ������ ��� ������ Ŭ����
		// ȸ�� �߰�, �˻�, ������ ���� ����� ���� PhoneInfo ��ü�� �����ϴ� �۾��Դϴ�.
		// ���� ȸ���߰� �� �˻� ������ ��ü ����ó ����� �����ϴ� ������ Ŭ�������� ó���ϴ°� ������.
		//������ ���� Ŭ����: PhoneInfo ��ü���� �߰�, �˻�, �����ϴ� ���� �÷��� ���� ����� ���	
}

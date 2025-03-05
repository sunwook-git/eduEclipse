package kosa.video;

public class SpecialMember extends GeneralMember {

	//�������
	private int point;
	
	//�⺻ ������
	public SpecialMember() {}

	//������(�θ� ������ �������ְ� �ʱ�ȭ)
	public SpecialMember(String id, String name, String address, int point) {
		super(id, name, address);	   //�θ��� �����ڸ� ȣ��
		this.point = point;
	}
	
	public void printSpecial () {
		System.out.println("ȸ���� ���̵� : " + getId());
		System.out.println("ȸ���� �̸� : " + getName());
		System.out.println("ȸ���� �ּ� : " + getAddress());		
		getRentalVideo().videoInfo();
		System.out.println("ȸ���� ���ʽ� ������ ���� : " + point);	
		}
	}
	

package kosa.io;

import java.io.Serializable;

//Serializable : ��ü�� ����ȭ �Ҽ� �ִ��� ������ �Ǵ���
public class Member implements Serializable{
	private String name;
	
	//����Ʈ ������
	public Member() {}

	//������
	public Member(String name) {
		super();
		this.name = name;
	}

	//set, get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
}



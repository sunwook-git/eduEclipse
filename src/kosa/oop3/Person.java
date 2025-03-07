package kosa.oop3;

public class Person {
	
	//������� ����
	private String name;
	private Role role;
	
	//�⺻ ������
	public Person() {}

	//������
	//texi�� dump��  Role�̶�� implement �������̽��� ���Ͽ� ���� �� ����
	public Person(String name, Role role) {		
		super();
		this.name = name;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doIt() {
		role.doing();
	}
}

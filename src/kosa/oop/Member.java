package kosa.oop;

public class Member {
	
	//��� ����
	private String Name;
	private int age;
		
	//����Ʈ ������
	public Member () {}

	//������
	public Member(String name, int age) {
		super();
		this.Name = name;
		this.age = age;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}
			
	//�������
	public void memberInfo() {
		System.out.println("�̸� : " + Name + ", ���� : " + age);
	}
}

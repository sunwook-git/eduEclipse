package kosa.api;

public class Person {
	private String name;
	private int age;
	
	//����Ʈ ������
	public Person() {}

	//������	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//set get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {	//p2�� (Person���� ������ Ÿ���� object�� �ٲ�)
		Person p = (Person)obj;		//�ڽ��� ���� ������ Ÿ���� Person���� ������ ����ȯ �ؾߵ�
		if (name.equals(p.getName()) && age == p.getAge()) {	//object���� getName�޼ҵ尡 ���� ���� ����ȯ �������
			return true;
		} else {
			return false;
		}
	}
}

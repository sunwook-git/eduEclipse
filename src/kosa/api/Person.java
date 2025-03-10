package kosa.api;

public class Person {
	private String name;
	private int age;
	
	//디폴트 생성자
	public Person() {}

	//생성자	
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
	public boolean equals(Object obj) {	//p2가 (Person으로 들어오면 타입이 object로 바뀜)
		Person p = (Person)obj;		//자신의 본래 데이터 타입인 Person으로 강제적 형변환 해야됨
		if (name.equals(p.getName()) && age == p.getAge()) {	//object에는 getName메소드가 없음 따라서 형변환 해줘야함
			return true;
		} else {
			return false;
		}
	}
}

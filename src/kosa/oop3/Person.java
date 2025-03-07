package kosa.oop3;

public class Person {
	
	//멤버변수 설정
	private String name;
	private Role role;
	
	//기본 생성자
	public Person() {}

	//생성자
	//texi와 dump가  Role이라는 implement 인터페이스를 통하여 받을 수 있음
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

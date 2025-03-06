package kosa.oop3;

public class Person {
	
	//멤버변수 설정
	private String name;
	private Role role;
	
	//기본 생성자
	public Person() {}

	//생성자
	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public void doIt() {
		role.doing();
	}
}

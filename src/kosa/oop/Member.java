package kosa.oop;

public class Member {
	
	//멤버 변수
	private String Name;
	private int age;
		
	//디폴트 생성자
	public Member () {}

	//생성자
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
			
	//정보출력
	public void memberInfo() {
		System.out.println("이름 : " + Name + ", 나이 : " + age);
	}
}

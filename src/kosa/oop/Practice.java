package kosa.oop;

public class Practice {

	private String name;
	private int age;
	
	public Practice() {}

	
	public Practice(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


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
	
	//출력
	public void memberInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	
	
}

package kosa.io;

import java.io.Serializable;

//Serializable : 객체를 직렬화 할수 있는지 없는지 판단함
public class Member implements Serializable{
	private String name;
	
	//디폴트 생성자
	public Member() {}

	//생성자
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



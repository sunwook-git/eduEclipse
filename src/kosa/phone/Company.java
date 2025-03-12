package kosa.phone;

import java.io.Serializable;

//객체 직렬화 하기위해 Serializable  implements 해준다
public class Company extends PhoneInfo implements Serializable{
	private String dept;
	private String position;
	
	//기본 생성자
	public Company() {}

	//생성자
	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	//setter, getter
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void show() {		
		super.show();
		System.out.println("부서 : " + dept);
		System.out.println("직급 : " + position);
	}
	
	
}

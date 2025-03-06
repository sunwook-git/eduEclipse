package kosa.phone;

public class Company extends PhoneInfo {
	private String dept;
	private String position;
	
	//扁夯 积己磊
	public Company() {}

	//积己磊
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
		System.out.println("何辑 : " + dept);
		System.out.println("流鞭 : " + position);
	}
	
	
}

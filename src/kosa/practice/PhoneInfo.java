package kosa.practice;

public class PhoneInfo {

	//한 명에 대한 전화번호부 
	
	//매게변수 작성
	private String name;
	private String phoneNo;
	private String birth;
	
	//기본 생성자
	public PhoneInfo() {}

	//생성자
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	//setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	//한 객체에 대한 내용 출력
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("생년월일 : " + birth);
	}
	
	
	
}

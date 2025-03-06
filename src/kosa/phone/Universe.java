package kosa.phone;

public class Universe extends PhoneInfo {
	private String major;
	private String year;
	
	//기본 생성자
	public Universe() {}

	//생성자
	public Universe(String name, String phoneNo, String birth, String major, String year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}

	//setter getter
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);					
	}
}

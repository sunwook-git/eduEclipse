package kosa.oop;

public class Phone {
	
	//인스턴스 변수
	private String name;
	private int number;
	private int date;
	
	//기본 생성자
	public Phone() {}

	//생성자
	public Phone(String name, int number, int date) {
		super();
		this.name = name;
		this.number = number;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	
	
}

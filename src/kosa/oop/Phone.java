package kosa.oop;

public class Phone {
	
	//�ν��Ͻ� ����
	private String name;
	private int number;
	private int date;
	
	//�⺻ ������
	public Phone() {}

	//������
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

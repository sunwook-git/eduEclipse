package kosa.data;

public class Student {
	private String name;
	private int score;
	
	//디폴트 생성자
	public void Student() {}

	//생성자
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	//set,get 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

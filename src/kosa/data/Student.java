package kosa.data;

public class Student {
	private String name;
	private int score;
	
	//����Ʈ ������
	public void Student() {}

	//������
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	//set,get �޼ҵ�
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

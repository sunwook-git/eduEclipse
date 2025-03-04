package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	//�л� �̸� 
	private String name;
	
	//�л��� ������û�� �����
	private List<Course> courses;
	
	//�⺻ ������
	public Student() {}

	//������(name�� �ʱ�ȭ, Course�� �迭�� ������� ������ �ʱ�ȭ �ؾߵ�)
	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//���� �߰� (course �Ű����� �Ѿ���� courses�迭�� �߰���)
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this); 	//this
	}
	
	//���
	public void printMember() {
		System.out.println("�л��̸�: " + name);
		for (Course course : courses) {
			System.out.println("��������: " + course.getCourseName());
		}
	}
}

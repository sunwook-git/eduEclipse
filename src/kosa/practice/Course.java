package kosa.practice;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	//��� ��������
	private String courseName;
	private List<Student> students;
	
	//�⺻ ������
	public Course() {}

	//������
	public Course(String courseName) {
		super();
		this.courseName = courseName;
		students = new ArrayList<Student>();			
	}
	
	//seter, getter
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	//�л� �߰�
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//���� ���
	public void printCourse() {
		System.out.println("����� : " + courseName);
		for (Student student : students) {
			System.out.println("������û �л��� : " + student.getName());
		}
	}
	
}

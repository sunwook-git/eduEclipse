package kosa.practice;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	//멤버 변수선언
	private String courseName;
	private List<Student> students;
	
	//기본 생성자
	public Course() {}

	//생성자
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
	
	//학생 추가
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//과목 출력
	public void printCourse() {
		System.out.println("과목명 : " + courseName);
		for (Student student : students) {
			System.out.println("수강신청 학생명 : " + student.getName());
		}
	}
	
}

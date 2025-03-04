package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;	//과목명
	private List<Student> students; 	//수강한 학생들을 담기 위한 배열
	
	//기본 생성자
	public Course() {}

	//생성자(생성자 생성시 courseName만 초기화되어있고 배열은 초기화 되어있지 않으므로)
	//배열생성하여 students에 넣어줌
	public Course(String courseName) {
		super();
		this.courseName = courseName;
		students = new ArrayList<Student>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	//학생추가
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void printCourse() {
		System.out.println("과목명 : " + courseName);
		for (Student student : students) {
			System.out.println("수강신청 학생명 : " + student.getName());
		}
	}
}

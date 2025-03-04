package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	//학생 이름 
	private String name;
	
	//학생이 수강신청한 과목들
	private List<Course> courses;
	
	//기본 생성자
	public Student() {}

	//생성자(name만 초기화, Course는 배열이 만들어진 다음에 초기화 해야됨)
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
	
	//과목 추가 (course 매개변수 넘어오면 courses배열에 추가함)
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this); 	//this
	}
	
	//출력
	public void printMember() {
		System.out.println("학생이름: " + name);
		for (Course course : courses) {
			System.out.println("수강과목: " + course.getCourseName());
		}
	}
}

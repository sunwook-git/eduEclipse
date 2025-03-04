package kosa.practice;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	//멤버변수
	private String name;
	private List<Course> courses;
	
	//기본 생성자
	public Student() {}

	//생성자
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
		course.addStudent(this);
		
	}
	
	//출력
	public void printMember() {
		System.out.println("학생이름 : " + name);
		for (Course course : courses) {
			System.out.println("수강과목 : " + course.getCourseName());
		}
	}
	
}

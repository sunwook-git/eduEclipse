package kosa.practice;

public class Main2 {
	
	public static void main(String[] args) {
	
	Course c1 = new Course("�����а���");
	Course c2 = new Course("���������");
	Course c3 = new Course("�����Ͱ���");
	
	Student s1 = new Student("ȫ�浿");
	Student s2 = new Student("�ڱ浿");
	
	//�л��� ������û
	s1.register(c1);
	s1.register(c2);
	
	s2.register(c2);
	s2.register(c3);
	
	//���
	s1.printMember();
	System.out.println();
	s2.printMember();
	
	System.out.println("============");
	
	c2.printCourse();
	}
}

package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		String name = "홍길동";
		Texi role = new Texi();		
		//dump role = new dump();
		
		Person person = new Person(name, role);
		person.doIt();
	}
}

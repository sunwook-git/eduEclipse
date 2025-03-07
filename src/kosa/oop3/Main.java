package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		
		Texi texi = new Texi();		
		//Dump dump = new dump();
		
		Person person = new Person("홍길동", texi);
		person.doIt();
	}
}

package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		
		Texi texi = new Texi();		
		//Dump dump = new dump();
		
		//이름 없는 이너 클래스 생성
		Texi texi1 = new Texi();
		Person p = new Person("홍길동" , new Role() {
			
			@Override
			public void doing() {
				System.out.println("열심히 운전 중");				
			}
		});
		p.doIt();
		
//		Person person = new Person("홍길동", texi);
//		person.doIt();
	}
}

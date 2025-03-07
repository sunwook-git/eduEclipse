package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		// MyType => 익명 클래스로 구현
		MyType mt = new MyType() {

			@Override
			public void hello() {
				System.out.println("Hello");
			}
		};
		mt.hello();
	}
}

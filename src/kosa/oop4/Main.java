package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		// MyType => �͸� Ŭ������ ����
		MyType mt = new MyType() {

			@Override
			public void hello() {
				System.out.println("Hello");
			}
		};
		mt.hello();
	}
}

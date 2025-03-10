package kosa.oop3;

public class MyThread implements Runnable {

//어떤 인터페이스를 implements를 하면 오버라이딩해야하는 메소드가 있다.
	@Override
	public void run() {
		// 멀티스레드 작업 내용 작성
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
		System.out.println("메인 동작");
	}
}

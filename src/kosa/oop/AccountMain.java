package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account;		//참조형(클래스 타입) , account를 참조변수라고 부름
		account = new Account("111-111", "홍길동", 10000); 	// 객체 생성(메모리 할당) 후 account에 대입, 생성한 객체의 주소값을 참조
																													// 인스턴스화, 인스턴스 변수		
		Account account2 = new Account("222-222", "박길동", 20000);
		
		Account account3 = new Account("333-333", "김길동");
		
		account.deposit(5000);	 //Exception에 대한 try~catch 작성(자동완성활용)
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		account.printAccount();		
		System.out.println("===========");
		account2.printAccount();		
	}
}

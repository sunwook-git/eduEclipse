package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("111-111", "홍길동", 5000, "222-222");
	
		try {
			ca.pay("222-222", 1000);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		ca.printAccount();
	}
}

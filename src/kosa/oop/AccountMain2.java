package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {

		//CheckingAccount 생성을 Account형 데이터 타입으로 생성(부모로 형 변환)
		//자식->부모 : 묵시적 형 변환		
		//Account ca = new CheckingAccount("222-222", "김길동", 5000, "222-222");
//		Account ca = new Account("111-111", "홍길동", 10000);
//		// 자신만이 가지고 있는 메소드는 호출안됨 -> Account로 형 변환 했기 때문에
//		// 오버라이딩 된 메소드는 가능
//		// 본래의 자신의 데이터형으로 강제 형변환 해야됨
//		// ca.pay("222-222", 2000);
//		
//		if (ca instanceof CheckingAccount) {
//			CheckingAccount ca2 = (CheckingAccount)ca;				
//		try {
//			ca2.pay("222-222", 2000);
//		} catch (Exception e) {			
//			e.printStackTrace();
//		}
//		ca2.printAccount();
//	} else {
//		System.out.println("캐스트 불가");
//	}
//		서로다은 데이터가 한 부모로 형 변환 
		Account arr[] = { 
				new Account("111-111", "홍길동", 10000),
				new CheckingAccount("222-222", "김길동", 5000, "222-222"),
				new MinusAccount("333-333", "박길동", 5000, 10000)
		};
		
		for (int i = 0; i < arr.length; i++) {									
			if (arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("222-222", 5000);	//pay메소드 CheckingAccount 형 변환 
				} catch (Exception e) {					
					e.printStackTrace();
				}								
			}
			arr[i].printAccount();
		}

		CheckingAccount ca = new CheckingAccount("111-111", "홍길동", 5000, "222-222");
		MinusAccount ma = new MinusAccount("111-111", "박길동", 5000, 10000);

		try {
			ma.withdraw(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ma.printAccount();
//		try {
//			ca.pay("222-222", 1000);
//		} catch (Exception e) {			
//			e.printStackTrace();
//		}
//		ca.printAccount();
	}
}

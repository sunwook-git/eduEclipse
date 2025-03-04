package kosa.oop;

public class Account {
	// Account 클래스로 부터 Account 객체를 생성
	// 객체로부터 공통된 데이터 구조와 기능을 추출
	// 상태(필드) : 계좌번호, 계좌주, 잔액
	// 기능(메서드) : 입금, 출금
	
	//멤버변수(객체가 생성되었을때)
	//필드 => private => set/get 메서드 접근 => 정보은닉 (캡슐화)
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
	//디폴트 생성자(파라미터가 없는 것)
	public Account() {}
	
	
	public Account(String accountNo, String ownerName) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}

	//생성자(constructor), 생성자 호출이 끝나면 메모리에서 사라짐
	//객체를 초기화 하는데 사용, 객체를 생성할 수 있는 타입 결정
	//public 리턴 x, 클래스 이름과 같아야함
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//입금
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액부족");
		}
		balance -= amount;
		return amount;				
	}
	
	//출력
	public void printAccount() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
	}
	
	//오버로딩(데이터 타입을 가지고 확인)
	public void printAccount(int a) {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
	}

	//캡슐화
	public String getAccountNo() {
		return accountNo;
	}

	//캡슐화
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
}

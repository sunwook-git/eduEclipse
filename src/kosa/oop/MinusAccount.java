package kosa.oop;

public class MinusAccount extends Account {
	private int creditLine;		//마이너스 한도
	
	//기본 생성자
	public MinusAccount() {}

	//생성자
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);		//부모의 생성자 초기화
		this.creditLine = creditLine;		//creditLine 초기화
	}

	//setter, getter
	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	
	//Account의 출금하다 메소드를 오버라이딩
	//조건
	//1. 상속관계
	//2. 메소드의 시그니처(접근제어자, 리턴형,메소드 이름, 파라미터) 일치
	//3. 메소드의 내용 불일치(재정의)
	//4. 오버라이딩 된 메소드가 우선순위로 호출됨
	
	@Override
	public int withdraw(int amount) throws Exception {
		if (getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		}
		int balance = getBalance();
		setBalance(balance - amount);
		
		return amount;
		//필요하면 사용, 여기서 super는 부모의 withdraw를 호출
		//return super.withdraw(amount);		
	}

	@Override
	public void printAccount() {		
		super.printAccount();
		System.out.println("마이너스 한도: " + creditLine);
	}		
}

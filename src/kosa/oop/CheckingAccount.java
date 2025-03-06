package kosa.oop;

public class CheckingAccount extends Account {	
	
	//멤버변수
	private String cardNo;
	
	//기본 생성자
	public CheckingAccount() {}

	//생성자 
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);		//부모의 생성자를 호출(초기화 o)
		this.cardNo = cardNo;
	}	
	
	public int pay(String cardNo, int amount) throws Exception  {
		
		//멤버변수가 보유한 카드 번호와 메서드 인자로 넘어온 cardNo가 같지 않은 경우
		//사용자가 결제를 시도한 카드 번호와 계좌에 등록된 카드번호가 다른 경우 예외발생
		if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("결제불능");
		}
		return withdraw(amount);		
	}

	@Override
	public void printAccount() {		
		super.printAccount();		//부모에 있는 printAccount 메소드 호출
		System.out.println("카드번호: " + cardNo);		
	}	
}

package kosa.oop;

public class CheckingAccount extends Account {	
	
	//멤버변수
	private String cardNo;
	
	//기본 생성자
	public CheckingAccount() {}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);		//부모의 생성자를 호출(초기화 o)
		this.cardNo = cardNo;
	}	
	
	public int pay(String cardNo, int amount) throws Exception  {
		if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("결제불능");
		}
		return withdraw(amount);		
	}	
}

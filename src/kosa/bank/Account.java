package kosa.bank;

public class Account {
	
	//멤버 변수 선언
	private String id;
	private long balance;
	
	//기본 생성자(기본값 -> 문자 : "null", 숫자 : 0)
	public Account() {}

	//생성자
	public Account(String id, long balance) {	//전달받은 id와 balance값을 멤버 변수에 할당
		super();
		this.id = id;
		this.balance = balance;
	}

	//setter, getter(멤버변수가 private이므로 get으로 접근해야함)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//입금
	public boolean deposit(long amount) {
		balance += amount;
		return true;	//타입이 boolean이므로 true false로 리턴해야 한다. 
	}
	
	//출금
	public boolean withdraw(long amount) {
		if (amount > balance) {
			return false;			
		}		
		balance -= amount;
		return true;	//타입이 boolean이므로 true false로 리턴해야 한다. 
	}
}

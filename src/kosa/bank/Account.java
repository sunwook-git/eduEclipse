package kosa.bank;

public class Account {
	
	//멤버 변수 선언
	private String id;
	private long balance;
	
	//기본 생성자
	public Account() {}

	//생성자
	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	//setter, getter
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
		return true;
	}
	
	//출금
	public boolean withdraw(long amount) {
		if (amount > balance) {
			return false;			
		}		
		balance -= amount;
		return true;
	}
}

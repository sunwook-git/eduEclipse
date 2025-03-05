package kosa.bank;

public class Customer {
	
	//멤버 변수 선언 
	private String id;
	private String name;
	private Account account;
	
	//기본 생성자
	public Customer() {}

	//생성자
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.account = new Account(id, balance);	 //고객이 생성될때 계좌도 같이 생성됨	
	}

	//setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}

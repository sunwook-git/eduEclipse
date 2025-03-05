package kosa.bank;

public class Customer {
	
	//멤버 변수 선언 
	private String id;
	private String name;
	private Account account;	//고객의 계좌 정보를 담고 있는 Account 객체를 참조
	
	//기본 생성자
	public Customer() {}

	//생성자(Customer생성자가 balance를 인자로 받아 고객생성 동시에 해당고객의 계좌에 초기잔액을 설정)
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		//고객이 생성될때 자동으로 계좌도 같이 생성되도록함 Accout 클래스의 생성자로 이동 
		this.account = new Account(id, balance);	 	
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

package kosa.bank;

public class Customer {
	
	//��� ���� ���� 
	private String id;
	private String name;
	private Account account;	//���� ���� ������ ��� �ִ� Account ��ü�� ����
	
	//�⺻ ������
	public Customer() {}

	//������(Customer�����ڰ� balance�� ���ڷ� �޾� ������ ���ÿ� �ش���� ���¿� �ʱ��ܾ��� ����)
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		//���� �����ɶ� �ڵ����� ���µ� ���� �����ǵ����� Accout Ŭ������ �����ڷ� �̵� 
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

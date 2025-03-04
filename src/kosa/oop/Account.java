package kosa.oop;

public class Account {
	// Account Ŭ������ ���� Account ��ü�� ����
	// ��ü�κ��� ����� ������ ������ ����� ����
	// ����(�ʵ�) : ���¹�ȣ, ������, �ܾ�
	// ���(�޼���) : �Ա�, ���
	
	//�������(��ü�� �����Ǿ�����)
	//�ʵ� => private => set/get �޼��� ���� => �������� (ĸ��ȭ)
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
	//����Ʈ ������(�Ķ���Ͱ� ���� ��)
	public Account() {}
	
	
	public Account(String accountNo, String ownerName) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}

	//������(constructor), ������ ȣ���� ������ �޸𸮿��� �����
	//��ü�� �ʱ�ȭ �ϴµ� ���, ��ü�� ������ �� �ִ� Ÿ�� ����
	//public ���� x, Ŭ���� �̸��� ���ƾ���
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//�Ա�
	public void deposit(int amount) {
		balance += amount;
	}
	
	//���
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("�ܾ׺���");
		}
		balance -= amount;
		return amount;				
	}
	
	//���
	public void printAccount() {
		System.out.println("���¹�ȣ: " + accountNo);
		System.out.println("������: " + ownerName);
		System.out.println("�ܾ�: " + balance);
	}
	
	//�����ε�(������ Ÿ���� ������ Ȯ��)
	public void printAccount(int a) {
		System.out.println("���¹�ȣ: " + accountNo);
		System.out.println("������: " + ownerName);
		System.out.println("�ܾ�: " + balance);
	}

	//ĸ��ȭ
	public String getAccountNo() {
		return accountNo;
	}

	//ĸ��ȭ
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
}

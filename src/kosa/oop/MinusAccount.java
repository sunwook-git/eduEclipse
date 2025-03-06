package kosa.oop;

public class MinusAccount extends Account {
	private int creditLine;		//���̳ʽ� �ѵ�
	
	//�⺻ ������
	public MinusAccount() {}

	//������
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);		//�θ��� ������ �ʱ�ȭ
		this.creditLine = creditLine;		//creditLine �ʱ�ȭ
	}

	//setter, getter
	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	
	//Account�� ����ϴ� �޼ҵ带 �������̵�
	//����
	//1. ��Ӱ���
	//2. �޼ҵ��� �ñ״�ó(����������, ������,�޼ҵ� �̸�, �Ķ����) ��ġ
	//3. �޼ҵ��� ���� ����ġ(������)
	//4. �������̵� �� �޼ҵ尡 �켱������ ȣ���
	
	@Override
	public int withdraw(int amount) throws Exception {
		if (getBalance() + creditLine < amount) {
			throw new Exception("�ܾ׺���");
		}
		int balance = getBalance();
		setBalance(balance - amount);
		
		return amount;
		//�ʿ��ϸ� ���, ���⼭ super�� �θ��� withdraw�� ȣ��
		//return super.withdraw(amount);		
	}

	@Override
	public void printAccount() {		
		super.printAccount();
		System.out.println("���̳ʽ� �ѵ�: " + creditLine);
	}		
}

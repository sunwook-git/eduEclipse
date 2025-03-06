package kosa.oop;

public class CheckingAccount extends Account {	
	
	//�������
	private String cardNo;
	
	//�⺻ ������
	public CheckingAccount() {}

	//������ 
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);		//�θ��� �����ڸ� ȣ��(�ʱ�ȭ o)
		this.cardNo = cardNo;
	}	
	
	public int pay(String cardNo, int amount) throws Exception  {
		
		//��������� ������ ī�� ��ȣ�� �޼��� ���ڷ� �Ѿ�� cardNo�� ���� ���� ���
		//����ڰ� ������ �õ��� ī�� ��ȣ�� ���¿� ��ϵ� ī���ȣ�� �ٸ� ��� ���ܹ߻�
		if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("�����Ҵ�");
		}
		return withdraw(amount);		
	}

	@Override
	public void printAccount() {		
		super.printAccount();		//�θ� �ִ� printAccount �޼ҵ� ȣ��
		System.out.println("ī���ȣ: " + cardNo);		
	}	
}

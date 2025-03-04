package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account;		//������(Ŭ���� Ÿ��) , account�� ����������� �θ�
		account = new Account("111-111", "ȫ�浿", 10000); 	// ��ü ����(�޸� �Ҵ�) �� account�� ����, ������ ��ü�� �ּҰ��� ����
																													// �ν��Ͻ�ȭ, �ν��Ͻ� ����		
		Account account2 = new Account("222-222", "�ڱ浿", 20000);
		
		Account account3 = new Account("333-333", "��浿");
		
		account.deposit(5000);	 //Exception�� ���� try~catch �ۼ�(�ڵ��ϼ�Ȱ��)
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		account.printAccount();		
		System.out.println("===========");
		account2.printAccount();		
	}
}

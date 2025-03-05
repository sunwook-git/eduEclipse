package kosa.bank;

import java.util.Arrays;

public class MyBank {
	
	//������� ����
	private int customersNum;	//��ϵ� ������ �����ϴ� ����(�⺻�� : 0)
	private Customer customers[];	//���� ���� �ֱ� ������ �迭 ������ ����
	
	//�⺻ ������
	public MyBank() {
		customers = new Customer[5];
	}
	
	//setter, getter
	public int getCustomersNum() {	//getCustomersNum�� �� ���� ����
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

	public Customer[] getArr() {		//getArr�� �� �迭�� ����
		return customers;
	}

	public void setArr(Customer[] arr) {
		this.customers = customers;
	}
	
	//�� �߰���
	public void addCustomer(String id, String name, long balance) {
		//ũ��5�� �迭�� ���������Ƿ� private int customersNum�� �⺻���� 0�̱� ������
		//0���� 1�� �����Ͽ� 5���� �����ϸ� ���� �߰��ϰ� 5���� �ʰ��Ͽ� �߰��Ϸ��� �ҽ�
		//�ε��� ������ �ʰ��Ͽ� �����߻�
		customers[customersNum++] = new Customer(id, name, balance);		
	}

	//�� �˻� : 2�� �޴�Ŭ�� �� ���� id �Է� �� getCustomer�� �Ű������� ��� id���� �Ѿ��
	public Customer getCustomer(String id) {
		Customer cust = null; 	//�迭 �ʱ�ȭ
		//���� ��ϵ� ���������� ����ؾ� �Ǳ� ������ i�� customersNum���� �����ؾ���
		for (int i = 0; i < customersNum; i++) {
			//BankSystem���� �Է��� id���� �迭�� �ִ� id���� ���Ͽ�
			//������ �ش� �迭�� cust������ �ְ� �ݺ��� ����
			if (customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}

	//���� ��ϵ� �� ��� ��ȯ(�� ����ŭ ũ�⸦ ���� ���ο� �迭 ������ �����迭�� ���뺹���Ͽ� ��ȯ) 
	public Customer[] getAllCustomers() {
		//customersNum : ���� ��ϵ� ���� ��
		Customer newCustomers[] = new Customer[customersNum];
		
		//���1
		//System.arraycopy(customers, 0, newCousCustomers, 0, customersNum);
		
		//���2
		newCustomers = Arrays.copyOf(customers, customersNum);
		return newCustomers;
	}
}

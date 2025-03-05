package kosa.bank;

import java.util.Arrays;

public class MyBank {
	
	//������� ����
	private int customersNum;	//��ϵ� ������ �����ϴ� ����
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
	
	//�� �߰�
	//addCustomer���� String id, String name, long balance�� ���� �� �ִ� ����
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);		
	}

	//�� �˻�
	public Customer getCustomer(String id) {
		Customer cust = null; 	//�迭 �ʱ�ȭ
		for (int i = 0; i < customersNum; i++) {
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

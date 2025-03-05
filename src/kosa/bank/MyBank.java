package kosa.bank;

import java.util.Arrays;

public class MyBank {
	
	//멤버변수 선언
	private int customersNum;
	private Customer customers[];
	
	//기본 생성자
	public MyBank() {
		customers = new Customer[5];
	}
	
	//setter, getter
	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

	public Customer[] getArr() {
		return customers;
	}

	public void setArr(Customer[] arr) {
		this.customers = customers;
	}
	
	//고객 추가
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);		
	}

	public Customer getCustomer(String id) {
		Customer cust = null;
		for (int i = 0; i < customersNum; i++) {
			if (customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}

	public Customer[] getAllCustomers() {
		Customer newCustomers[] = new Customer[customersNum];
		
		//방법1
		//System.arraycopy(customers, 0, newCousCustomers, 0, customersNum);
		
		//방법2
		newCustomers = Arrays.copyOf(customers, customersNum);
		return newCustomers;
	}
}

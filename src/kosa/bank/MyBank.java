package kosa.bank;

import java.util.Arrays;

public class MyBank {
	
	//멤버변수 선언
	private int customersNum;	//등록된 고객수를 관리하는 변수
	private Customer customers[];	//여러 고객이 있기 때문에 배열 변수로 설정
	
	//기본 생성자
	public MyBank() {
		customers = new Customer[5];
	}
	
	//setter, getter
	public int getCustomersNum() {	//getCustomersNum로 고객 수를 관리
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

	public Customer[] getArr() {		//getArr로 고객 배열에 접근
		return customers;
	}

	public void setArr(Customer[] arr) {
		this.customers = customers;
	}
	
	//고객 추가
	//addCustomer에서 String id, String name, long balance로 받을 수 있는 이유
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);		
	}

	//고객 검색
	public Customer getCustomer(String id) {
		Customer cust = null; 	//배열 초기화
		for (int i = 0; i < customersNum; i++) {
			if (customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}

	//현재 등록된 고객 모두 반환(고객 수만큼 크기를 가진 새로운 배열 생성후 기존배열의 내용복사하여 반환) 
	public Customer[] getAllCustomers() {
		//customersNum : 현재 등록된 고객의 수
		Customer newCustomers[] = new Customer[customersNum];
		
		//방법1
		//System.arraycopy(customers, 0, newCousCustomers, 0, customersNum);
		
		//방법2
		newCustomers = Arrays.copyOf(customers, customersNum);
		return newCustomers;
	}
}

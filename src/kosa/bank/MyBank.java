package kosa.bank;

import java.util.Arrays;

public class MyBank {
	
	//멤버변수 선언
	private int customersNum;	//등록된 고객수를 관리하는 변수(기본값 : 0)
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
	
	//고객 추가유
	public void addCustomer(String id, String name, long balance) {
		//크기5인 배열을 생성했으므로 private int customersNum의 기본값은 0이기 때문에
		//0부터 1씩 증가하여 5까지 증가하며 고객을 추가하고 5명을 초과하여 추가하려고 할시
		//인덱스 범위를 초과하여 에러발생
		customers[customersNum++] = new Customer(id, name, balance);		
	}

	//고객 검색 : 2번 메뉴클릭 후 고객의 id 입력 시 getCustomer로 매개변수가 담긴 id값이 넘어옴
	public Customer getCustomer(String id) {
		Customer cust = null; 	//배열 초기화
		//현재 등록된 고객수까지만 출력해야 되기 때문에 i는 customersNum까지 증가해야함
		for (int i = 0; i < customersNum; i++) {
			//BankSystem에서 입력한 id값과 배열에 있는 id값을 비교하여
			//맞으면 해당 배열을 cust변수에 넣고 반복문 종료
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

package kosa.bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankSystem {
	private MyBank myBank;		//MyBank 
	
	public BankSystem(){	
		myBank = new MyBank();		//MyBank 생성자로 이동
		showMenu();
	}
	
	public void showMenu(){		//show method 만들기
		//사용자의 입력을 받기위해 초기화
		String  menu = null;			
		String id = null;
		String name = null;
		long balance = 0;
		
		do{
		
			System.out.println("****메뉴를 입력하세요****");
			System.out.println("1. 고객등록");
			System.out.println("2. 고객보기(1명)");
			System.out.println("3. 고객전체보기");
			System.out.println("4. 고객예금출금");
			System.out.println("5. 고객예금입금");
			System.out.println("***끝내기***");
			System.out.println("***************");
			System.out.print(">>");			
			
			menu = readFromKeyboard();			
		
			if(menu.equals("1")){				//고객등록
				
				System.out.print("ID를 입력하세요: ");
				id = readFromKeyboard();
				
				System.out.print("이름을 입력하세요: ");
				name = readFromKeyboard();
				
				System.out.print("잔고를 입력하세요: ");
				balance = Long.parseLong(readFromKeyboard());
				
				//사용자가 메뉴 1번을 입력 후 id,name,balance를 입력 시 
				//mybank 클래스의 addCustomer 메소드를 실행
				myBank.addCustomer(id, name, balance);
				
			}
			else if(menu.equals("2")){
				System.out.print("고객ID를 입력하세요: ");
				id = readFromKeyboard();
				//MyBank의 getCustomer메소드에서 반환된 Customer객체가 cust 변수에 할당				
				Customer cust = myBank.getCustomer(id);
				//cust는 Customer 객체이므로 Customer 클래스에 getAccount 메서드가 있으므로
				//접근이 가능하며 Account 객체를 반환하므로 Account 클래스의 getBalance를 호출할수 있다 
				System.out.println(cust.getId() +":" + cust.getName() + ": "
						+ cust.getAccount().getBalance());	
			
			}
			else if(menu.equals("3")){
				
				//
				Customer[] allCust = myBank.getAllCustomers();
				
				for(int i=0;i<allCust.length;i++){
					System.out.println(allCust[i].getId() + ": " +
													allCust[i].getName() + " :" +
													allCust[i].getAccount().getBalance());
				}				
			}
			else if(menu.equals("4")){
				
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");				
				}else{
					System.out.print("출금액을 입력하세요: ");
					balance = Long.parseLong(readFromKeyboard());
					
					if(cust.getAccount().withdraw(balance)){
						System.out.println("정상적으로 출금되었습니다.");
						System.out.println("출금후 잔고는 :" + cust.getAccount().getBalance());
					}else{
						System.out.println("잔고가 부족합니다.");
					}
				}
				
			}
			else if(menu.equals("5")) {
				
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if (cust == null) {
					System.out.print("등록된 고객이 아닙니다.");					
				} else {
					System.out.print("입금액을 입력하세요: ");
					balance = Long.parseLong(readFromKeyboard());
					
					if (cust.getAccount().deposit(balance)) {
						System.out.println("정상적으로 입금되었습니다.");
						System.out.println("입금후 잔고는 :" + cust.getAccount().getBalance());
					}
				}
			}
		}
			while(!menu.equals("q"));						
	}
	
	


	public String readFromKeyboard(){
		String input = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return input;
	}
	
	public static void main(String[] args) {
		BankSystem bank = new BankSystem();

	}

}











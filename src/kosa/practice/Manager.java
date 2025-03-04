package kosa.practice;

public class Manager {

	//전화번호 목록을 관리하는 기능
	//여러개의 PhoneInfo 객체를 관리하기 위해 배열사용
	private PhoneInfo arr[];
	private int count;
	
	//기본 생성자
	public Manager() {
		arr = new PhoneInfo[10];
	}
	
	//전호번호 추가
	public void addPhoneInfo() {
		System.out.print("이름 : ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = DataInput.sc.nextLine();
		
	}
	
	
}

package kosa.video;

public class SpecialMember extends GeneralMember {

	//멤버변수
	private int point;
	
	//기본 생성자
	public SpecialMember() {}

	//생성자(부모 생성자 지정해주고 초기화)
	public SpecialMember(String id, String name, String address, int point) {
		super(id, name, address);	   //부모의 생성자를 호출
		this.point = point;
	}
	
	public void printSpecial () {
		System.out.println("회원의 아이디 : " + getId());
		System.out.println("회원의 이름 : " + getName());
		System.out.println("회원의 주소 : " + getAddress());		
		getRentalVideo().videoInfo();
		System.out.println("회원의 보너스 포인터 적립 : " + point);	
		}
	}
	

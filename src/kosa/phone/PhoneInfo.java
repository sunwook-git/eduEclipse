package kosa.phone;

import java.io.Serializable;

//객체 직렬화 하기위해 Serializable  implements 해준다
public class PhoneInfo implements Serializable {
	//매개 변수 작성
		private String name;
		private String phoneNo;
		private String birth;
		
		
		//기본 생성자(초기화 x), 멤버변수인 경우 객체를 dafault로 생성을 하면 초기화하지 않아도 디폴트 값이 존재한다.
		public PhoneInfo() {}

		//생성자(객체 초기화)
		public PhoneInfo(String name, String phoneNo, String birth) {
			super();
			//ex) this는 자기 자신의 객체의 필드를 나타냄 
			this.name = name;
			this.phoneNo = phoneNo;
			this.birth = birth;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getBirth() {
			return birth;
		}

		public void setBirth(String birth) {
			this.birth = birth;
		}
		
		//한 객체에 대한 내용 출력
		public void  show() {
			System.out.println("이름 : " + name);
			System.out.println("전화번호 : " + phoneNo);
			System.out.println("생년월일 : " + birth);			
		}
		
		//메서드
		//class에서 메서드는 자기 한 객체에대해 자신의 필드를 제어하거나 출력하기 위해서 사용.
		// PhoneInfo 클래스: 한 명의 연락처 정보를 담는 데이터 클래스
		// 회원 추가, 검색, 삭제와 같은 기능은 여러 PhoneInfo 객체를 관리하는 작업입니다.
		// 따라서 회원추가 및 검색 삭제는 전체 연락처 목록을 관리하는 별도의 클래스에서 처리하는게 적절함.
		//별도의 관리 클래스: PhoneInfo 객체들을 추가, 검색, 삭제하는 등의 컬렉션 관리 기능을 담당	
}

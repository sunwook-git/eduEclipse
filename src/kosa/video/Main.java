package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "파묘", "최민식");
		Video v2 = new Video("2", "서울의봄", "황정민");
		
		GeneralMember gm = new GeneralMember("aaa", "홍길동","동탄");		
		gm.rental(v1);   // 1.GeneralMember 클래스의 rental 메서드의 매개변수에 v1 전달
		//gm.printMember();
		
		SpecialMember sm = new SpecialMember("1", "박길동", "가락동", 100);
		sm.rental(v1);
		sm.printSpecial();
	}
}

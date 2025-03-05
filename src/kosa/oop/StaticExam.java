package kosa.oop;

public class StaticExam {
	int total;	  //필드 => 메모리 : 객체 생성(지역변수가 아니기 때문에  default 값을 가지고 있음)
	static int grandTotal;  //정적변수, static변수, 클래스 변수 => 클래스 로딩(최초한번만 로딩, 여러번 호출하여도 한번만 호출됨) : 공용변수로사용, 
	
	public void add() {
		total += 10;
		grandTotal += 10;
	}
	
	public static void add2() {
		//total += 10;
		grandTotal += 10;
	}
	
	public static void main(String[] args) {

		add2();
		
		
//		StaticExam se = new StaticExam();
//		StaticExam se2 = new StaticExam();
//		se.add();
//		se2.add();
//		
//		System.out.println("total : " + se.total);
//		System.out.println("grandTotal : " + StaticExam.grandTotal);
//		System.out.println("total2 : " + se2.total);
//		System.out.println("grandTotal2 : " + StaticExam.grandTotal);
	}
}

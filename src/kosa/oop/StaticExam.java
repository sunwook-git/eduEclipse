package kosa.oop;

public class StaticExam {
	int total;	  //�ʵ� => �޸� : ��ü ����(���������� �ƴϱ� ������  default ���� ������ ����)
	static int grandTotal;  //��������, static����, Ŭ���� ���� => Ŭ���� �ε�(�����ѹ��� �ε�, ������ ȣ���Ͽ��� �ѹ��� ȣ���) : ���뺯���λ��, 
	
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

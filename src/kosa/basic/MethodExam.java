package kosa.basic;

public class MethodExam {
	
	//�޼��� ����
	//���� ������, (static), ������(void), �޼��� �̸�(�Ķ����)
	
	public static void printChar(char ch, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
//		printChar('#', 10);
//		printChar('?', 20);
//		printChar('^', 30);
		
		//return���� �ִ� ��� �Ʒ��� ���� ������ ����� ������ �ִ�.
		int result = add(10, 20);
		System.out.println("��� : " + result);
		System.out.println("��� : " + add(20,30));
	}
}

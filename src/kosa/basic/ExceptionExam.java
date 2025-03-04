package kosa.basic;

public class ExceptionExam {

	public static void main(String[] args) {
		try {
			System.out.println("1");		//"1" ��µ�
			noEquals(10, 10);						// ���ܰ� �߻��ϸ� �� ��� catch������ �̵�
			System.out.println("2");		// "2" ��¾ȵ�(������ ���ܰ� �߻������Ƿ�)
		} catch (Exception e) {	
			System.out.println("3");		// "3" ��� (catch ���� ���ܰ� �߻��ϸ� ���)
			e.printStackTrace();
		} finally {
			System.out.println("4");		// "4" ��µ�
		}
		System.out.println("5");			// "5" ��µ�
	}
	
	public static void noEquals(int a, int b)throws Exception {
		if (a == b) {
			throw new Exception("���� �� �ȵ�");
		}
	}
}

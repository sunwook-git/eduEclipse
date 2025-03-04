package kosa.basic;

public class ExceptionExam {

	public static void main(String[] args) {
		try {
			System.out.println("1");		//"1" 출력됨
			noEquals(10, 10);						// 예외가 발생하면 그 즉시 catch문으로 이동
			System.out.println("2");		// "2" 출력안됨(위에서 예외가 발생했으므로)
		} catch (Exception e) {	
			System.out.println("3");		// "3" 출력 (catch 문은 예외가 발생하면 출력)
			e.printStackTrace();
		} finally {
			System.out.println("4");		// "4" 출력됨
		}
		System.out.println("5");			// "5" 출력됨
	}
	
	public static void noEquals(int a, int b)throws Exception {
		if (a == b) {
			throw new Exception("같은 값 안돼");
		}
	}
}

package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		
		int num; 	// ���� ������ if�ȿ� �� ������ ������
		if (1 == 1) {
			num = 100;
		}
		System.out.println(num);
		
		//����ȯ(�Ϲ���, ����)
		//int <==> char
		char ch = 'A';		
		System.out.println((int)ch);
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		//int(�⺻��) < ==> String(Object)
		//String num3 = "100�ȳ�";	  		// ���ڰ� �ƴ� ���� Integr�� ����ȯ�� �õ� ���� �� ��Ÿ���� ���� 
		String num3 = "100";
		int num4 = Integer.parseInt(num3);
		int result = num4 + 100;
		System.out.println(result);
		
		int num5  = 10;
		String num6 = String.valueOf(num5);		//"10"
		String num7 = num5 + "";		//"10"
		
		String str = 7 + "7" + 7;		//String Ÿ���� ��Ͱ� �����Ͽ��� String�� �ȴ�.
		System.out.println(str);
		
		boolean bool = true;
		
		// %������ : ������ ������
		System.out.println((10%3));
		
		//2�� ����̰ų� 3�� ����� �ƴ� ���ڸ� ���
		for (int i = 1; i <= 100;  i++) {
			if (!(i%2 == 0) | (i%3==0) ) {
				System.out.print(i + ", ");
			}
		}
		
		//���մ��� ������
		System.out.println();
		int n = 0;
		n+=1;
		System.out.println(n);
		
		//
		int x = 10;
		int y = 0;
		
		y = ++x;	//��ġ ����, ��ġ ����
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		//���� ������
		int b = 40;
		int c = 20;
		
		int max = (b>c) ? b: c;
		System.out.println(max);
	}

}

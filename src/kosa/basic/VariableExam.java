package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// ������ �����͸� ��� �׸�, ������ ���� �پ� ex) ȫ�浿, 100, 3.14, true
		// �⺻�� ������ Ÿ��(primitive type)
		//byte, short, int, long => ������
		// float, double => �Ǽ���
		// char => ������(����1��)
		//boolean => ����
		//String => ���ڿ� (Object Type)
		
		int num; //���� ���� (4byte ���� �޸� �Ҵ�)
		int arr[]; //�迭 ����(Object Type : ���۷��� Ÿ��)
						//������(�޸𸮿� �ִ� �ּҰ��� ������ �ֱ⶧���� ��������)
						//arr[] ������ ������ ���� ������ ���� ������ �޸𸮿� �ִ� �ּҰ��� �ֱ⶧���� �����Ҽ� �����Ƿ� ������ ���� �����ͼ���밡�� 
		
		num = 100;	//���� �ʱ�ȭ
		int num2 = 10;	//�޼��� �ȿ� ����� ���� , ���ú���(��������) => �ݵ�� �ʱ�ȭ �� ���
		System.out.println(num2);  //	num2 ������ �ʱ�ȭ ���� �ʾұ� ������ ������
		
		int num3 = 200;	//���� ���� �� �ʱ�ȭ
		System.out.println("����: " + num3);
		
		//���� ����� ���ǻ���
		//������ : Ư������x, ���ڷ� ����x, �����x, �ҹ��ڷ� ǥ��(ī��ǥ���)
		// �⺻ ���ͷ� : ""(String), true(boolean), 10(int), 3.14(double) => default 
		
		// float num4 = 3.14;	//double���� �ƴ� float�� ����Ͽ��� ������
		float num5 = 3.14f;	//f�� ���̹Ƿμ� ����ȯ �Ǿ� ��밡��
		
		// casting(����ȯ) : ����
		// byte < short < int < long < float < double < String
		// int <==> char
		double  b =3.14;
		int c = (int)b;	//���� ����ȯ
		System.out.println(c);	//������ �ս� �߻�
		
		double e = c;		//�Ϲ��� ����ȯ
		System.out.println(e);
		
		long num6 = 100L;	//�⺻ ���ͷ��� Long���� �ٲ�
		
		int num7 = 010;	//�տ� ����0�� �� �� 8������ �ν�
		System.out.println(num7);
	}

}

package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		//��ø for���� �̿��Ͽ� ��ü ������ ���
//		for(int i =2; i<=9; i++) {				//������ ��
//			for(int j=1; j<=9; j++) {		//������ ���� ���
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//			System.out.println(); 			//�� ���� ������ ����
//		}
		
		//����> 4x+5y = 60 =>  x,y�� ������(��� ����Ǽ�)
		for(int i=0; i<=15; i++) {
			for(int j=0; j<=12; j++) {
				if ((4*i) + (5*j) == 60) {
					System.out.println("x: " + i + ", y: " + j);
				}								
			}
		}
	}
}

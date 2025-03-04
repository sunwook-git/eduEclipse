package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		//중첩 for문을 이용하여 전체 구구단 출력
//		for(int i =2; i<=9; i++) {				//각각의 단
//			for(int j=1; j<=9; j++) {		//각단의 내용 출력
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//			System.out.println(); 			//한 단이 끝나고 개행
//		}
		
		//퀴즈> 4x+5y = 60 =>  x,y를 구하자(모든 경우의수)
		for(int i=0; i<=15; i++) {
			for(int j=0; j<=12; j++) {
				if ((4*i) + (5*j) == 60) {
					System.out.println("x: " + i + ", y: " + j);
				}								
			}
		}
	}
}

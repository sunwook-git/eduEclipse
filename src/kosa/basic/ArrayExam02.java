package kosa.basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		// 2차원 배열
		// 2차원 배열의 크기가 결정
		//int arr[][];
		//arr = new int[3][2];
		
		// 2차원 배열의 크기를 다를때
//		int arr2[][] = new int[3][];
//		arr2[0] = new int [2];
//		arr2[1] = new int [3];
//		arr2[2] = new int [4];
		
		// 2차원 배열 선언, 생성, 초기화
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}};	//[3][]
		
		//위 2차원 배열 전체 출력
		for(int i=0; i<arr3.length; i++) {				//1차원 배열(arr3.length 는 1차언 배열의 크기)
			for(int j=0; j<arr3[i].length; j++) {		//2차원 배열(i=0,1,2일때 각 배열의 크기를 구함)
				System.out.println(arr3[i][j]);
			}
		}
	}
}

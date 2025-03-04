package kosa.basic;

public class callByExam {

	public static int change(int num) {
		num +=10;
		return num;	//20
	}
	
	public static void change2(int brr[]) {	//change2(arr) 의 주소값 전달
		brr[0] = 200;		//brr 0번에 200대입
		System.out.println(brr);
	}
	
	public static void main(String[] args) {
//		int num = 10;
//		num = change(num);	//num = 20
//		System.out.println(num);		
		int arr[] = {100};
		change2(arr);
		System.out.println(arr);
		System.out.println(arr[0]);
	}
}

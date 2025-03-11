package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		//1~45 중복되지 않는 로또번호 6개 출력
		Random r = new Random();
		
		//1. 배열구현
//		int arr[] = new int[6];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(45) +1;
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) 
//					i = i-1;	// 중복이되었기 때문에 i값을 새로 입력받기위해 -1해줌
//			}
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		//2. List 구현
		List<Integer> list = new ArrayList<Integer>();
		
		//중복이되면 반복이 6번이 넘어갈수도 있기때문에 for문 사용하면 안됨
		while (true) {
			int n = r.nextInt(45) +1;			
			//해당 리스트에 n값이 중복인지 확인
			if (list.contains(n)) {
				continue;
			} else {
				list.add(n);
			}
			if (list.size() == 6) break;
		}
		Collections.sort(list);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+ ", ");
		}
		
		
		//3. Set구현(TreeSet) => 중복허용x
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		for (int i = 0; set.size()<6; i++) {
//			set.add(r.nextInt(45) +1);
//		}
//		System.out.println(set);
		
		
	}
}

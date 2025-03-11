package kosa.data;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add("수박");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}

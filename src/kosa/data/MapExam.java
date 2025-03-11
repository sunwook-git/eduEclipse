package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		//Map : (key,value), (key, value)... => HashMap
//		Map<String, String> map = 
//				new HashMap<String, String>();
//
//		map.put("1", "KIA");
//		map.put("2", "Samsung");
//		map.put("3", "LG");
//		
//		//사이즈 출력
//		System.out.println("요소의 사이즈: " + map.size());
//		
//		//삭제
//		if (map.containsValue("LG")) {
//			map.remove("3");
//		}
//		//출력
//		System.out.println("요소의 사이즈: " + map.size());
//		System.out.println("2위팀: " + map.get("2"));
		
		//map 실습2
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 50);
		map.put("이자바", 70);
		map.put("박자바", 30);
		map.put("최자바", 40);
		map.put("한자바", 90);
		map.put("강자바", 10);
		
		//map => key만 추출
		Set<String> set = map.keySet();
		System.out.println("응시자 명단: " + set);
		
		//map => value 추출
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		//총점,평균,최고점수,최저점수
		int total = 0;
		while(iter.hasNext()) {
			total += iter.next();
		}	
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/map.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
	}
}

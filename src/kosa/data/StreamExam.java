package kosa.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExam {

	public static void main(String[] args) {
		//아래와 같이 배열의 값을 List에 넣을 수 있음
		//List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//숫자의 경우에 아래와 같이 1~10까지의 범위에서 사용할 경우
//		List<Integer> numbers = IntStream.rangeClosed(1,  10)
//				.filter(n -> n%2 == 0)
//				.map(n -> n * n)
//				.boxed()
//				.collect(Collectors.toList());

//		
//		//짝수만 필터링하고 제곱한 후 리스트로 변환 => Stream으로 작성
//		List<Integer> squares = numbers.stream()
//				.filter(n -> n%2 == 0)	//원하는것을 뽑아내기위해
//				.map(n -> n * n)		//Map은 각각의 요소에서 작업해야 할때 사용
//				.collect(Collectors.toList());
//		
//		System.out.println(numbers);

		
		//List에 Student 객체 넣고 객체 바로 생성
//		List<Student> list = Arrays.asList(
//				new Student("홍길동",90),
//				new Student("홍동길",80),
//				new Student("김길동",70)				
//				);
//		
//		list.stream().mapToInt(s -> s.getScore())
//								.forEach(score -> System.out.println(score));

		
		//위의 코드를 줄여서 아래와 같이 표현가능
//		list.stream().map(Student::getName)
//							.forEach(name -> System.out.println(name));
		
		
		//스크림을 이용해서 "홍" 씨만 출력하세요 => filter		
		//객체의 이름의 첫번째가 홍씨로 시작하는 사람을 필터링
		//s : 3개의 student객체가 들어옴
		//list.stream()	
		//.filter(s -> s.getName().startsWith("홍"))	
			
			//아래에서 s는 필터링된 2개의 객체가 들어옴
			//.forEach(s -> System.out.println(s.getName()));
		
		String arr[] = {"BB", "CC", "AA"};
//		List<String> list2 = Arrays.asList(arr);
//		list2.stream().sorted().forEach(System.out::println);
			Arrays.stream(arr).sorted().forEach(System.out::println);
		
	}
}

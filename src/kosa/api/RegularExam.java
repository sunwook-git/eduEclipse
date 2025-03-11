package kosa.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print	("입력: ");
		String str = sc.nextLine();
		
		//abc 문자를 포함 여부 체크(앞이든 뒤든 abc가 있는지 체크)
//		if (str.matches(".*abc.*")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}

		//숫자만 3자리 유무 판단 
		//원래는 \d 인데 자바에서는 문법적의미를 가지고 있어서 \\d로 해야함
//		if (str.matches("[\\d]{3}")) {
//			System.out.println("3자리 입니다");
//		} else {
//			System.out.println("3자리가 아닙니다.");
//		}
		
		//알파벳, 숫자만 5자리 이상
//		if (str.matches("[\\w]{5,}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
		//한글만 3~5자리
//		if (str.matches("[가-힣]{3,5}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
		//퀴즈
		//dolsam77@nate.com ⇒ 매칭
		//432dolsam77@nate.com ⇒ 비매칭 (숫자로 시작하면 오류)
		//dolsam77nate.com ⇒ 비매칭(@가 없으면 오류)
		//dolsam77@nate.comcom ⇒ 비매칭(com이 2개 이상일 경우 오류)
		
		//dolsam :  ^[\\D]  => 숫자를 제외한 모든 문자로 시작
		// 77 : \\w => 알파벳이나 숫자
		// @ :  @
		// nate  :  \\w => 알파벳이나 숫자
		// .  =>  \\.  
		// com : \\w{2,3}$  =>  2~3자리의 알파벳이나 숫자로 끝남
//		if (str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) {			
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
		//이미지 파일 구별 => 대소문자 구분 없이(?i)
		//abc.git, abc.jpg, abc.PNG, abc.txt
//		if (str.matches("^\\S+\\.(?i)(jpg|git|png)$")) {
//			System.out.println("이미지 파일");
//		} else {
//			System.out.println("일반 파일");
//		}
		
			//SW -> 소프트웨어 라고 변경
			String message = "SW 5654548개발자 46처우와 4584근무여건 선진국 수준으로 개선해야 【서울=뉴시스】김형섭 기자 = 박근혜 대통령은 23일 소프트웨어(SW) 중심사회를 실현하기 위해서는 SW의 가치를 제대로 인정하는 데서 출발해야 한다고 말했다. 박 대통령은 이날 오전 판교 테크노밸리에서 열린 'SW 중심사회 실현 전략보고회'에서 우리나라가 IT 강국으로 지속 발전하기 위해서는 SW 분야의 경쟁력 확보가 시급한 과제라며 이같이 밝혔다. 박 대통령은 시장에서 SW의 가치를 제대로 인정하지 않아 SW 기업들의 수익성이 악화되고, 우수한 인재가 유입되지 않는 악순환의 고리를 끊어야 한다며 공공부문의 SW 제값주기 노력이 민간으로 확산돼 창의성과 노력이 온전히 보답 받는 환경을 조성해 나가도록 노력할 것이라고 약속했다.  이어 그동안 공공 정보화사업이 오히려 민간 SW 시장을 위축시킨다는 지적이 있었는데 민간의 기술과 산업발전을 위한 마중물 역할을 해야 할 정부가 오히려 민간시장을 위축시키는 일이 있어서는 안 될 것이라며 민간시장에 미치는 영향을 사전에 평가하는 등 공공 정보화사업 추진절차를 개선할 필요가 있다고 진단했다.  박 대통령은 또 SW 개발자의 처우와 근무여건도 선진국 수준으로 개선할 필요가 있다며 SW 개발자가 '꿈의 직업'이 돼 최고의 인재들이 유입되고 이들이 SW 산업 발전을 이끌어가고, 그래서 소프트웨어 개발자들의 처우가 더욱 개선되는 선순환 구조를 만들어 나가야 하겠다고 강조했다.  특히 자라나는 미래세대에 대한 SW 교육이 무엇보다 중요하다며 SW 중심사회의 주역이 될 미래 세대가 '컴퓨터적 사고'를 기본소양으로 갖출 수 있도록 초·중등학교에서부터 SW교육을 강화해야 한다고 말했다.";
//		String result = message.replaceAll("SW", "소프트웨어");
//		System.out.println(result);
			
			//문자열중 숫자를 제거하여 출력
			String result2 = message.replaceAll("\\d", ""); 
			//String result2 = message.replaceAll("[0-9]", "");
			System.out.println(result2);
	}
}
	
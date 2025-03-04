package kosa.mission;

import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// 로그인 예제를 구현해 보자.
		// id, pass 키보드로 부터 입력
		//기존 m_id, m_pass 모두일치하면 => 로그인 성공
		//id가 불일치 => 해당 아이디가 존재하지 않습니다.
		//pass 불일치 => 비밀번호가 일치하지 않습니다.
		
		//String m_id = "kosa";
		//String m_pass = "1234";
		Scanner sc  = new Scanner(System.in);
		
			System.out.print("id : ");
			String m_id = sc.nextLine();
				
		if (!m_id.equals("kosa")) {
			System.out.println("해당 아이디가 존재하지 않습니다.");
		} else {
			System.out.print("pass: ");
			String m_pass = sc.nextLine();
			
			if (m_pass.equals("1234")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}		
	}
}

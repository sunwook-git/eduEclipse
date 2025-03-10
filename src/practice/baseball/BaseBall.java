package practice.baseball;

import java.util.Arrays;

public class BaseBall {
	private int hidden[];
	
	public BaseBall() {
		hidden = new int[3];
		hidden[0] = (int)(Math.random() * 9) +1;
		
		do {
			hidden[1] = (int)(Math.random() * 9) +1;
		} while (hidden[0] == hidden[1]);
			
		do {
			hidden[2] = (int)(Math.random() * 9) +1;
		} while (hidden[0] == hidden[2] || hidden[1] == hidden[2]);
		
		//배열의 내용을 String으로 출력
		System.out.println("정답 : " + Arrays.toString(hidden));
				
	}
	
	//스트라이크 체크
	public int countStrike(int input[]) {	//사용자가 입력한 숮자 배열 input[] 
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			//난수입력 받은 배열과  사용자가 입력한 배열의 같은 자리수 확인
			if (hidden[i] == input[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	//볼체크
	public int countBall(int input[]) {
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			if(hidden[i] == input[(i+1)%3]) 
				ball++;
			if(hidden[i] == input[(i+2)%3])
				ball++;
		}
		return ball;
	}
	
}

package kosa.mission;

import java.util.Arrays;

public class BaseBall {
	
	// 난수를 생성(중복x)
	private int hidden[];

	public BaseBall() { // BaseBall 객체를 생성후 바로 hidden을 초기화 제일 처음 초기화 해주기 위해
		hidden = new int[3];
		hidden[0] = (int) (Math.random() * 9) + 1;
		do {
			hidden[1] = (int) (Math.random() * 9) + 1;
		} while (hidden[0] == hidden[1]);
		do {
			hidden[2] = (int) (Math.random() * 9) + 1;
		} while (hidden[0] == hidden[2] || hidden[1] == hidden[2]);

		System.out.println("정답 : " + Arrays.toString(hidden));
	}

	// 스트라이크 체크
	public int countStrike(int input[]) {
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			if (hidden[i] == input[i]) {
				strike++;
			}
		}
		return strike;
	}

	// 볼 체크
	public int countBall(int input[]) {
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			if (hidden[i] == input[(i + 1) % 3])
				ball++;
			if (hidden[i] == input[(i + 2) % 3])
				ball++;
		}
		return ball;
	}
}

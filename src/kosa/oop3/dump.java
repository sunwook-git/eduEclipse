package kosa.oop3;

public class Dump implements Role {	// Dump 및 Texi는 부모가 Role 이므로 Role 타입으로 형변환 가능하다

	@Override
	public void doing() {
		System.out.println("dump 호출");
	}
}

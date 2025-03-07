package kosa.oop3;

public class Dump implements Role {	//부모가 Role 이므로 Role 객체가 될수 있음

	@Override
	public void doing() {
		System.out.println("dump 호출");
	}
}

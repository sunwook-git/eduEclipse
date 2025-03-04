package kosa.practice;

public class Video {
	
	//멤버 변수 선언
	private String sno;
	private String title;
	private String actor;
	
	//기본 생성자
	public Video() {}

	//생성자
	public Video(String sno, String title, String actor) {
		super();
		this.sno = sno;
		this.title = title;
		this.actor = actor;
	}

	// getter, setter
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	//비디오 정보 출력
	public void videoinfo() {
		System.out.println("회원이 대여한 비디오 번호 : " + sno);
		System.out.println("회원이 대여한 비디오 제목 : " + title);
		System.out.println("회원이 대여한 비디오 주인공 : " + actor);
	}
}

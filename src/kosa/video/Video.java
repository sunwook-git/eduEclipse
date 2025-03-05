package kosa.video;

public class Video {
	
	//1개의 비디오 정보(멤버변수 선언)
	private String sno;			//번호
	private String title;			//제목
	private String actor;		//배우
	
	//기본 생성자
	public Video() {}

	//생성자(초기화)
	public Video(String sno, String title, String actor) {
		super();
		this.sno = sno;
		this.title = title;
		this.actor = actor;
	}
	
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

	//비디오 정보 출력 (자신의 필드값을 제어(수정 등)하거나 출력)
	public void videoInfo() {
		System.out.println("회원이 대여한 비디오 번호 : " + sno);
		System.out.println("회원이 대여한 비디오 제목 : " + title);
		System.out.println("회원이 대여한 비디오 배우 : " + actor);
	}
}

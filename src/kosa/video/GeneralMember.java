package kosa.video;

public class GeneralMember {
	
	//멤버 변수 선언
	private String id;
	private String name;
	private String address;
	private Video rentalVideo;   // GeneralMember 와 Video의 연관관계(주체 : GeneralMember, 대상: rentalVideo)
	
	//기본 생성자
	public GeneralMember() {}
		
	//생성자(초기화)
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	//일반회원 정보 출력
	public void printMember() {
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + address);
		rentalVideo.videoInfo();   //대여한 비디오 정보
	}
	
	public void rental(Video video) {    // 2.main에서 매개변수를 통해 전달받은 v1의 정보가 this.rentalVideo에 대입
		this.rentalVideo = video;
	}
}

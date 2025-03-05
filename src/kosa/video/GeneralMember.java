package kosa.video;

public class GeneralMember {
	
	//��� ���� ����
	private String id;
	private String name;
	private String address;
	private Video rentalVideo;   // GeneralMember �� Video�� ��������(��ü : GeneralMember, ���: rentalVideo)
	
	//�⺻ ������
	public GeneralMember() {}
		
	//������(�ʱ�ȭ)
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

	//�Ϲ�ȸ�� ���� ���
	public void printMember() {
		System.out.println("ȸ���� ���̵� : " + id);
		System.out.println("ȸ���� �̸� : " + name);
		System.out.println("ȸ���� �ּ� : " + address);
		rentalVideo.videoInfo();   //�뿩�� ���� ����
	}
	
	public void rental(Video video) {    // 2.main���� �Ű������� ���� ���޹��� v1�� ������ this.rentalVideo�� ����
		this.rentalVideo = video;
	}
}

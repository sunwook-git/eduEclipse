package kosa.video;

public class Video {
	
	//1���� ���� ����(������� ����)
	private String sno;			//��ȣ
	private String title;			//����
	private String actor;		//���
	
	//�⺻ ������
	public Video() {}

	//������(�ʱ�ȭ)
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

	//���� ���� ��� (�ڽ��� �ʵ尪�� ����(���� ��)�ϰų� ���)
	public void videoInfo() {
		System.out.println("ȸ���� �뿩�� ���� ��ȣ : " + sno);
		System.out.println("ȸ���� �뿩�� ���� ���� : " + title);
		System.out.println("ȸ���� �뿩�� ���� ��� : " + actor);
	}
}

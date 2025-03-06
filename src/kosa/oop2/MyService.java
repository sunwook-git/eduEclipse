package kosa.oop2;

public class MyService {
	private Dao dao;
	
	//멤버변수
	public MyService() {}

	//생성자
	public MyService(Dao dao) {	//OracleDao 가  Dao를 상속받았기 떄문에 가능함
		super();
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();		//모든 dao 클래스 abstract(추상클래스) 및  추상메서드 이기 때문에 
	}
}

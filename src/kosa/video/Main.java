package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "�Ĺ�", "�ֹν�");
		Video v2 = new Video("2", "�����Ǻ�", "Ȳ����");
		
		GeneralMember gm = new GeneralMember("aaa", "ȫ�浿","��ź");		
		gm.rental(v1);   // 1.GeneralMember Ŭ������ rental �޼����� �Ű������� v1 ����
		//gm.printMember();
		
		SpecialMember sm = new SpecialMember("1", "�ڱ浿", "������", 100);
		sm.rental(v1);
		sm.printSpecial();
	}
}

package kosa.practice;

public class Main {

	public static void main(String[] args) {
		Video v1 =  new Video("1", "Ʈ��������3", "������");
		Video v2 =  new Video("2", "��Ǫ�Ҵ�", "������");
		
		GeneralMember g1 = new GeneralMember("aaa", "ȫ�浿", "��ź");
		GeneralMember g2 = new GeneralMember("bbb", "��ö��", "����");
		g1.rental(v1);
		g1.printmember();		
	}
}

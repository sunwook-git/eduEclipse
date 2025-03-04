package kosa.practice;

public class Main {

	public static void main(String[] args) {
		Video v1 =  new Video("1", "Æ®·£½ºÆ÷¸Ó3", "¼­ºÀ¼ö");
		Video v2 =  new Video("2", "ÄôÇªÆÒ´õ", "Áö¼º¹Î");
		
		GeneralMember g1 = new GeneralMember("aaa", "È«±æµ¿", "µ¿Åº");
		GeneralMember g2 = new GeneralMember("bbb", "±èÃ¶¼ö", "¼­¿ï");
		g1.rental(v1);
		g1.printmember();		
	}
}

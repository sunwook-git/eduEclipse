package practice.inter;

public class InterfaceExample5 {

	public static void main(String[] args) {		
		Lable obj = new Lable("안녕하세요", 100, 30, "yellow", "green", "굴림체");
		printLabel(obj);
		
	}
	
	static void printLabel(Lable obj) {
		System.out.printf(
	            "%s: %d x %d 배경색(%s) 전경색(%s) 폰트(%s) %n", 
	            obj.text, obj.width, obj.height, 
	            obj.backgound, obj.foreground, obj.font);								
	}
}

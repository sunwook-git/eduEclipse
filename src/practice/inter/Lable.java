package practice.inter;

public class Lable implements Changeable {
	
	//¸â¹öº¯¼ö
	String text;
	int width, height;
	String foreground, backgound;
	String font;
	
	
	public Lable(String text, int width, int height, String foreground, String backgound, String font) {
		super();
		this.text = text;
		this.width = width;
		this.height = height;
		this.foreground = foreground;
		this.backgound = backgound;
		this.font = font;
	}

	@Override
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void setForegound(String color) {
		this.foreground = color;
	}

	@Override
	public void setBackgound(String color) {
		this.backgound = color;
	}

	@Override
	public void setFont(String font) {
		this.font = font;
	}

}

package kosa.cart;

public class Main {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook("맥노트북", 1000000);
		Phone phone = new Phone("갤럭시", 1200000, "삼성");

		Cart cart = new Cart();
		cart.addProduct(nb);
		cart.addProduct(phone);
		cart.listProduct();
	}
}

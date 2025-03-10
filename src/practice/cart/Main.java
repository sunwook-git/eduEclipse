package practice.cart;

public class Main {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook("갤럭시북", 1500000);
		Phone phone = new Phone("맥북", 2000000, "애플");

		Cart cart = new Cart();
		cart.addProduct(nb);
		cart.addProduct(phone);
		cart.listProduct();
	}
}

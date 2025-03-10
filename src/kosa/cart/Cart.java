package kosa.cart;

public class Cart {
	private Product arr[];
	private int count;
	
	public Cart() {
		arr = new Product[10];
	}
	
	public void addProduct(Product p) {
		arr[count++] = p;
	}
	
	public void listProduct() {
		for (int i = 0; i < count; i++) {
			arr[i].discount();
			arr[i].show();
		}
	}
}

//notebookr과 Phone은 서로다른 타입이므로 이를 프로덕트라는 인터페이스를 만들어

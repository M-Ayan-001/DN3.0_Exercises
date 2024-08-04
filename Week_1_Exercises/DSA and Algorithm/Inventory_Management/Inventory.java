import java.util.HashMap;
import java.util.Map;

public class Inventory {

	private HashMap<Integer, Product> map = new HashMap<>();

	public void add(Product product) {
		map.put(product.getProductId(), product);
		System.out.println(product.getProductId() + " ID product Added !");
	}

	public void remove(Product product) {
		map.remove(product.getProductId());
		System.out.println(product.getProductId() + " ID product Removed !");
	}

	public void update(Product product) {
		map.remove(product.getProductId());
		map.put(product.getProductId(), product);
		System.out.println(product.getProductId() + " ID product Updated !");
	}

	public void showInventory() {
		for (Map.Entry<Integer, Product> entry : map.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
	}

}

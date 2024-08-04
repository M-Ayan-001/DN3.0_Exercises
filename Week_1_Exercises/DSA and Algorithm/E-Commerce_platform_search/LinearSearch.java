
public class LinearSearch {

	public boolean find(Product[] arr, int productId) {

		for (Product pd : arr) {
			if (pd.getProductId() == productId) {
				return true;
			}
		}
		return false;
	}
}

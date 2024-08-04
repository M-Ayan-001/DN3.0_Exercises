
public class LinearSearch {
	public boolean find(Book[] arr, int productId) {

		for (Book pd : arr) {
			if (pd.getBookId() == productId) {
				return true;
			}
		}
		return false;
	}
}

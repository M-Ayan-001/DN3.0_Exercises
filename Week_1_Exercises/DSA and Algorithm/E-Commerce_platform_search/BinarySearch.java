import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

	public boolean find(Product[] arr, int productId) {

		Arrays.sort(arr, Comparator.comparingInt(Product::getProductId));

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid].getProductId() == productId) {
				return true;
			} else if (arr[mid].getProductId() < productId) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return false;
	}
}

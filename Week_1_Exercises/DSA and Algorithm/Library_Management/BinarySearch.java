import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
	public boolean find(Book[] arr, int productId) {

		Arrays.sort(arr, Comparator.comparingInt(Book::getBookId));

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid].getBookId() == productId) {
				return true;
			} else if (arr[mid].getBookId() < productId) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return false;
	}
}

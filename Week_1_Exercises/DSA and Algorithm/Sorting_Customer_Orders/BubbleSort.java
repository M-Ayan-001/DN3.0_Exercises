
public class BubbleSort {

	public void sort(Order[] arr, int len) {
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (arr[j].getTotalPrice() > arr[j + 1].getTotalPrice()) {
					Order temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void display(Order[] arr) {
		for (Order order : arr) {
			System.out.println(order.getTotalPrice() + " Rs. bill was for " + order.getCustomerName());
		}
	}
}

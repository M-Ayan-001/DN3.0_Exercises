
public class Test {

	public static void main(String[] args) {
		Order od1 = new Order(100, "Ayan", 58.50);
		Order od2 = new Order(101, "Sayan", 150.00);
		Order od3 = new Order(102, "Arnab", 350.50);
		Order od4 = new Order(103, "Gourav", 270.00);

		Order[] arr1 = { od4, od3, od1, od2 };

		Order[] arr2 = { od3, od2, od4, od1 };

		QuickSort quick = new QuickSort();
		quick.sort(arr1, 0, arr1.length - 1);
		quick.display(arr1);

		System.out.println();

		BubbleSort bubble = new BubbleSort();
		bubble.sort(arr2, arr2.length);
		bubble.display(arr2);

	}

}

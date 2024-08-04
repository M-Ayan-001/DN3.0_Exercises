
public class Test {

	public static void main(String[] args) {

		Product pd1 = new Product(100, "T-shirt", "Garments");
		Product pd2 = new Product(101, "Shoes", "Garments");
		Product pd3 = new Product(200, "Pen", "Stationary");
		Product pd4 = new Product(201, "Pencil", "Stationary");

		Product pd5 = new Product(300, "Cooker", "Kitchen Appliance");

		Product[] arr = { pd3, pd4, pd1, pd2 };

		LinearSearch linSrch = new LinearSearch();
		System.out.println(pd1.getProductName() + " Available : " + linSrch.find(arr, pd1.getProductId()));
		System.out.println(pd5.getProductName() + " Available : " + linSrch.find(arr, pd5.getProductId()));

		System.out.println();

		BinarySearch binSrch = new BinarySearch();
		System.out.println(pd1.getProductName() + " Available : " + binSrch.find(arr, pd1.getProductId()));
		System.out.println(pd5.getProductName() + " Available : " + binSrch.find(arr, pd5.getProductId()));

	}

}

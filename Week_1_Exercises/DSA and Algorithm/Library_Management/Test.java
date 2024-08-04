
public class Test {

	public static void main(String[] args) {
		Book pd1 = new Book(100, "Java book", "Navin Reddy");
		Book pd2 = new Book(101, "C book", "Anyanya Goswami");
		Book pd3 = new Book(200, "C++ book", "Bjarne Stroustrup");
		Book pd4 = new Book(201, "Mern book", "Hitesh Chowdhury");

		Book pd5 = new Book(300, "DBMS", "Benjamin Franklin");

		Book[] arr = { pd3, pd4, pd1, pd2 };

		LinearSearch linSrch = new LinearSearch();
		System.out.println(pd1.getTitle() + " Available : " + linSrch.find(arr, pd1.getBookId()));
		System.out.println(pd5.getTitle() + " Available : " + linSrch.find(arr, pd5.getBookId()));

		System.out.println();

		BinarySearch binSrch = new BinarySearch();
		System.out.println(pd1.getTitle() + " Available : " + binSrch.find(arr, pd1.getBookId()));
		System.out.println(pd5.getTitle() + " Available : " + binSrch.find(arr, pd5.getBookId()));
	}

}

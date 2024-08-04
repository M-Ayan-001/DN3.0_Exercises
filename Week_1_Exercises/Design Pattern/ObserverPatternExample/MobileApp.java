
public class MobileApp implements Observer {

	private String name;

	public MobileApp(String name) {
		this.name = name;
	}

	@Override
	public void update(double stockPrice) {
		System.out.println(name + ", nvidia stock price is updated to " + stockPrice + " Rs. View in Mobile App");
	}

}

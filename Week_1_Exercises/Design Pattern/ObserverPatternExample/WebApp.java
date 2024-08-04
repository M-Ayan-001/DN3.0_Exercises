
public class WebApp implements Observer {

	private String name;

	public WebApp(String name) {
		this.name = name;
	}

	@Override
	public void update(double stockPrice) {
		System.out.println(name + ", nvidia stock price is updated to " + stockPrice + " Rs. View in Web App");
	}

}

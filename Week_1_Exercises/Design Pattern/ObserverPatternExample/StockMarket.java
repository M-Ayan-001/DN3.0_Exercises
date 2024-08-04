import java.util.ArrayList;

public class StockMarket implements Stock {

	private ArrayList<Observer> list = new ArrayList<>();
	private double stockPrice;

	public void setPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public void register(Observer person) {
		if (!list.contains(person)) {
			list.add(person);
			System.out.println("Registration Successful !");
		} else {
			System.out.println("Already Registered !");
		}
	}

	@Override
	public void deregister(Observer person) {
		if (list.contains(person)) {
			list.remove(person);
			System.out.println("Deregistration Successful !");
		} else {
			System.out.println("Already Deregistered !");
		}

	}

	@Override
	public void notifyObserver() {
		for (Observer obs : list) {
			obs.update(stockPrice);
		}
	}

}

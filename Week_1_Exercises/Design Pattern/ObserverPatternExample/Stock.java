
public interface Stock {

	public void register(Observer person);

	public void deregister(Observer person);

	public void notifyObserver();

	public void setPrice(double price);
}


public class Test {

	public static void main(String[] args) {

		Stock nvidia = new StockMarket();
		nvidia.setPrice(500);

		Observer person1 = new MobileApp("Ayan");
		Observer person2 = new MobileApp("Sayan");
		Observer person3 = new MobileApp("Arnab");

		Observer person4 = new WebApp("Atanu");
		Observer person5 = new WebApp("Abhirup");
		Observer person6 = new WebApp("Ayanjoyti");

		nvidia.register(person1);
		nvidia.register(person2);
		nvidia.register(person3);
		nvidia.register(person4);
		nvidia.register(person5);
		nvidia.register(person6);

		nvidia.notifyObserver();

		nvidia.deregister(person2);
		nvidia.deregister(person5);

		nvidia.setPrice(505);

		nvidia.notifyObserver();

	}

}

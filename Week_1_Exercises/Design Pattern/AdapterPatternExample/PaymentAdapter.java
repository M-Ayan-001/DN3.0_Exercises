
public class PaymentAdapter {

	public void pay(String type, double amount) {

		if (type.equalsIgnoreCase("UPI")) {
			UPIAdapter upiAdapt = new UPIAdapter();
			upiAdapt.transfer(amount);
			upiAdapt.processPayment(amount);
		}
		if (type.equalsIgnoreCase("CARD")) {
			CardAdapter cardAdapt = new CardAdapter();
			cardAdapt.transfer(amount);
			cardAdapt.processPayment(amount);
		}

	}

}

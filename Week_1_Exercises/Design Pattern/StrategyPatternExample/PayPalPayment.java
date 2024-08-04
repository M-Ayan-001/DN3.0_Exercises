
public class PayPalPayment implements PaymentStrategy {

	private String number;
	private String name;

	public PayPalPayment(String number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public void pay(double amount) {
		System.out.println(name + " paid Rs. " + amount + " via Paypal " + "having phone no : " + number);
	}

}

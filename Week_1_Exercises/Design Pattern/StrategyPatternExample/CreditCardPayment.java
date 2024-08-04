
public class CreditCardPayment implements PaymentStrategy {

	private String cardNumber;
	private String expDate;
	private String name;

	public CreditCardPayment(String cardNumber, String expDate, String name) {
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.name = name;
	}

	@Override
	public void pay(double amount) {
		System.out.println(name + " paid Rs. " + amount + " via CreditCard xxxx-xxxx-xxxx-"
				+ cardNumber.substring(15, 19) + " having expiry date : " + expDate);
	}

}

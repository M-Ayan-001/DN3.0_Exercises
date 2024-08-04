
public class Test {

	public static void main(String[] args) {

		PaymentContext payCntxt = new PaymentContext();

		PaymentStrategy creditCard = new CreditCardPayment("1123-0000-5896-9871", "07/27", "Ayan");
		payCntxt.setPaymentStrategy(creditCard);
		payCntxt.makePayment(5000.89);

		PaymentStrategy paypal = new PayPalPayment("0198234759", "Ayan");
		payCntxt.setPaymentStrategy(paypal);
		payCntxt.makePayment(95575.56);

	}

}
